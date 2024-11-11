/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseConnection;

import model.Movie;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.CineVerseModel;

/**
 *
 * @author ADMIN
 */
public class CineVerseDAO {
    private CineVerseModel cineVerseModel;

    public CineVerseDAO(CineVerseModel cineVerseModel) {
        this.cineVerseModel = cineVerseModel;
//        setMovieData();
    }

    public CineVerseModel getCineVerseModel() {
        return cineVerseModel;
    }

    public void setCineVerseModel(CineVerseModel cineVerseModel) {
        this.cineVerseModel = cineVerseModel;
    }
    
    
    public void setMovieData(){
        String query = "Select * from movie";
        
        List<Movie> movies = new ArrayList<Movie>();
        
        try {
            Connection conn = DatabaseConnection.getConnection();
            
            Statement statement = conn.createStatement();
            
            ResultSet rs = statement.executeQuery(query);
            
            
            while (rs.next()){
                String mid = rs.getString(1);
                String title = rs.getString(2);
                String genre = rs.getString(3);
                String language = rs.getString(4);
                String subtitle = rs.getString(5);
                int duration = rs.getInt(6);
                String director = rs.getString(7);
                String cast = rs.getString(8);
                
                Date releaseDate = rs.getDate(9);
                LocalDate releaseLocalDate = releaseDate.toLocalDate();
                Date endDate = rs.getDate(10);
                LocalDate endLocalDate = endDate.toLocalDate();
                String description = rs.getString(11);

                movies.add(new Movie(mid, title, genre, language, subtitle, duration, director, cast, releaseLocalDate, endLocalDate, description));
            }
            cineVerseModel.setMovies(movies);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static void createAndUpdateMovie(Movie m){
        if (isExistMovie(m.getMid())){
            
        }
        else {
            try {
            
                Date releaseDate = Date.valueOf(m.getRelease_date());
                Date endDate = Date.valueOf(m.getEnd_date());
                
                Connection conn = DatabaseConnection.getConnection();
                CallableStatement c = conn.prepareCall("{call sp_addMovie(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
                c.setString(1, m.getMid());
                c.setString(2, m.getTitle());
                c.setString(3, m.getGenre());
                c.setString(4, m.getLanguage());
                c.setString(5, m.getSubtitle());
                c.setInt(6, m.getDuration());
                c.setString(7, m.getDirector());
                c.setString(8, m.getCast());
                c.setDate(9, releaseDate);
                c.setDate(10, endDate);
                c.setString(11, m.getDescription());
                
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    
    public static boolean isExistMovie(String movieID){
        
        try {
            PreparedStatement p = null;
            ResultSet r = null;
            Connection conn = DatabaseConnection.getConnection();
            
            p = conn.prepareStatement("Select fn_isExistMovie(?)");
            
            p.setString(1, movieID);
            r = p.executeQuery();
            r.next();
            return r.getBoolean(1);
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    
    public static void main(String[] args) {
//        List<Movie> m = new ArrayList<Movie>();
//        m = CineVerseDAO.MovieData();
//        System.out.println(m);
//        
//        CineVerseDAO c = new CineVerseDAO(new CineVerseModel());
//        c.isExistMovie("MOV004");
    }
}
