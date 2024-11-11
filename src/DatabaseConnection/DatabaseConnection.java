/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseConnection;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import model.Schedule_model;

public class DatabaseConnection {
    
    public static Connection getConnection(){
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CINEVERSE", "root", "phuc0376@1");
            
        } catch (Exception e) {
            System.out.println("Cannot connect");
            e.printStackTrace();
        }
        
        return conn;
    }
    
    public static void main(String[] args) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CINEVERSE", "root", "phuc0376@1");
            conn = getConnection();
            if(conn!=null)
                System.out.println("Connected");

         
            
            conn.close();
      } catch (Exception e) {
            System.out.println("Cannot connect");
            e.printStackTrace();
        }

    }
 
    /*public static void main(String[] args) {
        String sql = "select * from schedule;";
        try {
            Connection con = DatabaseConnection.getConnection();
            Statement statement = con.createStatement();
            
            ResultSet result = statement.executeQuery(sql);
            
            while(result.next()){
                String scid = result.getString("scid");        // Lấy scid (mã lịch chiếu)
                String mid = result.getString("mid");          // Lấy mid (mã phim)
                String rid = result.getString("rid");          // Lấy rid (mã phòng chiếu)
                LocalDate sdateLocal = result.getDate("sdate").toLocalDate(); // Chuyển sdate thành LocalDate
                LocalTime stimeLocal = LocalTime.parse(result.getTime("stime").toString()); // Chuyển stime thành LocalTime
                double priceDouble = result.getDouble("price");               // Chuyển price thành double
                
                
                System.out.println(stimeLocal);                
            }
            
            
            
        } catch (Exception e) {
             e.printStackTrace();
        }
    }
    */
}
