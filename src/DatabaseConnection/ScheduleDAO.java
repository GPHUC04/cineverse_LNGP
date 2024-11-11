/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseConnection;

import com.mysql.cj.xdevapi.Result;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import model.Schedule_model;

/**
 *
 * @author kenlee
 */
public class ScheduleDAO {
    private List<Schedule_model> schedules ;
    private static DatabaseConnection databaseconection;
    
    
    
    public  ScheduleDAO(){
    this.schedules = new ArrayList<Schedule_model>();
        setScheduleData();
   
    
}

    public List<Schedule_model> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule_model> schedules) {
        this.schedules = schedules;
    }
    
     public static ArrayList<String> loaddatacomboboxMovie(){
        ArrayList<String> list = new ArrayList<>(); 
        try {
            Connection con = databaseconection.getConnection();
            
            String sql = "select mid from Movie; ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet result =  ps.executeQuery();
              while(result.next()){  
                  list.add(result.getString("mid" ));
              }
            
        } catch (Exception e) {
        }
        return list;
        
    }
     
        public static ArrayList<String> loaddatacomboboxMovieName(){
        ArrayList<String> list = new ArrayList<>(); 
        try {
            Connection con = databaseconection.getConnection();
            
            String sql = "select title from Movie;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet result =  ps.executeQuery();
              while(result.next()){  
                  list.add(result.getString("title" ));
              }
            
        } catch (Exception e) {
        }
        return list;
        
    }
        
        
    
    
    
    public static ArrayList<String> loaddatacomboboxRoom(){
        ArrayList<String> list = new ArrayList<>(); 
        try {
            Connection con = databaseconection.getConnection();
            
            String sql = "select rid from ScreenRoom; ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet result =  ps.executeQuery();
              while(result.next()){  
                  list.add(result.getString("rid" ));
              }
            
        } catch (Exception e) {
        }
        return list;
        
    }
    
      public static ArrayList<String> loaddatacomboboxShowTime(){
        ArrayList<String> list = new ArrayList<>(); 
        try {
            Connection con = databaseconection.getConnection();
            
            String sql = "select stime from Schedule; ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet result =  ps.executeQuery();
              while(result.next()){  
                  list.add(result.getString("stime" ));
              }
            
        } catch (Exception e) {
        }
        return list;
        
    }
public boolean isExistschedule(String scid) {
    String sql = "SELECT COUNT(*) FROM Schedule WHERE scid = ?";
    try (Connection conn = databaseconection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, scid);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return rs.getInt(1) > 0;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}
     public void deleteschedule(Schedule_model m) {
    try {
        
        Connection conn = databaseconection.getConnection();
        
       
        CallableStatement c = conn.prepareCall("{call sp_deleteSchedule(?)}");
        
        
        c.setString(1, m.getScid());  
       
        c.execute(); 

      
        schedules.removeIf(schedule -> schedule.getScid().equals(m.getScid()));
        
    } catch (SQLException e) {
        
        System.err.println("Database error: " + e.getMessage());
    } catch (Exception e) {
       
        e.printStackTrace();
    }
}

        
        
public void setScheduleData() {
    String sql = "SELECT * FROM schedule;";
    try (Connection con = databaseconection.getConnection();
         Statement statement = con.createStatement()) {

        ResultSet result = statement.executeQuery(sql);
        
        // Lấy dữ liệu từ result set và chuyển thành đối tượng Schedule_model
        while (result.next()) {
            String scid = result.getString("scid");
            String mid = result.getString("mid");
            String rid = result.getString("rid");
            
            // Chuyển đổi các kiểu dữ liệu từ cơ sở dữ liệu
            LocalDate sdateLocal = result.getDate("sdate").toLocalDate(); // java.sql.Date -> LocalDate
            LocalTime stimeLocal = result.getTime("stime").toLocalTime(); // java.sql.Time -> LocalTime
            float price = result.getFloat("price");
            
            // Thêm đối tượng Schedule_model vào danh sách schedules
            schedules.add(new Schedule_model(scid, mid, rid, sdateLocal, stimeLocal, price));
        }
        
    } catch (Exception e) {
        e.printStackTrace();
    }
}

  
   public void addSchedule(Schedule_model s) {
    if (isExistschedule(s.getScid())) {
        System.out.println("Schedule already exists!");
        return;
    }
    
    // Kết nối tới cơ sở dữ liệu
    try (Connection conn = databaseconection.getConnection()) {
        CallableStatement c = conn.prepareCall("{call sp_addSchedule(?, ?, ?, ?, ?, ?)}");

        // Chuyển đổi dữ liệu từ Java thành kiểu dữ liệu phù hợp với cơ sở dữ liệu
        java.sql.Date sqlDate = java.sql.Date.valueOf(s.getSdate()); // LocalDate -> java.sql.Date
        Time sqlTime = Time.valueOf(s.getStime());  // LocalTime -> java.sql.Time
        
        // Cấu hình các tham số cho stored procedure
        c.setString(1, s.getScid());
        c.setString(2, s.getMid());
        c.setString(3, s.getRid());
        c.setDate(4, sqlDate);  // Truyền ngày vào
        c.setTime(5, sqlTime);  // Truyền thời gian vào
        c.setDouble(6, s.getPrice()); // Truyền giá tiền vào

        // Thực thi thủ tục lưu trữ
        c.executeUpdate();

        // Thêm vào danh sách schedules trong Java
        schedules.add(s);
    } catch (SQLException e) {
        // Log lỗi
        System.err.println("Database error: " + e.getMessage());
        e.printStackTrace();
    }
}

public void editSchedule(Schedule_model s) {
    Connection conn = null;
    CallableStatement c = null;
    try {
        // Kết nối đến cơ sở dữ liệu
        conn = databaseconection.getConnection();
        conn.setAutoCommit(false);  // Tắt auto-commit

        // Chuẩn bị gọi stored procedure
        c = conn.prepareCall("{call sp_editSchedule(?, ?, ?, ?, ?, ?)}");

        // Chuyển đổi ngày và thời gian sang kiểu dữ liệu SQL
        java.sql.Date sqlDate = java.sql.Date.valueOf(s.getSdate());
        java.sql.Time sqlTime = java.sql.Time.valueOf(s.getStime());  // Chuyển LocalTime thành java.sql.Time

        // Truyền các tham số vào stored procedure
        c.setInt(1, Integer.parseInt(s.getScid()));  // Dùng setInt thay vì setString cho scid
        c.setString(2, s.getMid());
        c.setString(3, s.getRid());
        c.setDate(4, sqlDate);
        c.setTime(5, sqlTime);
        c.setDouble(6, s.getPrice());

        // Thực thi stored procedure
        c.executeUpdate();  // Sử dụng executeUpdate() thay vì executeQuery()

        conn.commit();  // Commit giao dịch

        // Cập nhật danh sách "schedules" sau khi chỉnh sửa
        schedules.removeIf(schedule -> schedule.getScid().equals(s.getScid()));
        schedules.add(s);

    } catch (SQLException e) {
        if (conn != null) {
            try {
                conn.rollback();  // Rollback nếu có lỗi
            } catch (SQLException ex) {
                System.err.println("Rollback failed: " + ex.getMessage());
            }
        }
        System.err.println("Database error: " + e.getMessage());
        e.printStackTrace();
    } catch (IllegalArgumentException e) {
        System.err.println("Invalid schedule data: " + e.getMessage());
    } finally {
        try {
            if (c != null) c.close();
            if (conn != null) conn.setAutoCommit(true);  // Reset auto-commit
        } catch (SQLException e) {
            System.err.println("Error closing resources: " + e.getMessage());
        }
    }
}

  
 // Lấy danh sách các showtimes dựa trên tên bộ phim
    public ArrayList<String> getShowTimesByMovieName(String movieName) {
        ArrayList<String> showTimes = new ArrayList<>();
        String sql = "SELECT stime FROM Schedule WHERE mid = (SELECT mid FROM Movie WHERE title = ?)";
        try (Connection conn = databaseconection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, movieName);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                showTimes.add(rs.getString("stime"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return showTimes;
    }
    
    
public ArrayList<String> loadMovieNames() {
    ArrayList<String> movieNames = new ArrayList<>();

    // Câu lệnh SQL để lấy tên phim
    String sql = "SELECT title FROM Movie";

    try (   Connection conn = databaseconection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            // Thêm tên phim vào danh sách
            movieNames.add(rs.getString("title"));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return movieNames;
}



}
