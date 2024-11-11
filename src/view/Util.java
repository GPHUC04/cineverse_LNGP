/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import DatabaseConnection.DatabaseConnection;
import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.Schedule_model;
/**
 *
 * @author kenlee
 */
public class Util {
    Object value ; // chứa mã 
    Object text ;  // chứa tên 
    private static DatabaseConnection dataconection ;
    
    public Util(Object value , Object text){
        this.value = value;
        this.text = text;
        
    }
    @Override
    public String toString(){
        return text.toString();
    } 
    
    public int MaINT(){
        return Integer.parseInt(value.toString());
    } // hàm lấy mã kiểu int 
    
    
    public String MaSTRING(){
        return value.toString();
          
    }
    
    public static ArrayList<String> loaddatacomboboxMovie(){
        ArrayList<String> list = new ArrayList<>(); 
        try {
            Connection con = dataconection.getConnection();
            
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
    
    public static ArrayList<String> loaddatacomboboxRoom(){
        ArrayList<String> list = new ArrayList<>(); 
        try {
            Connection con = dataconection.getConnection();
            
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
    
    
    
   
    
    
    
    
}


