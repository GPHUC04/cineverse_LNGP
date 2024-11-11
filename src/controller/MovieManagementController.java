/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MainFrame;
import view.MovieManagementPanel;

/**
 *
 * @author ADMIN
 */
public class MovieManagementController implements ActionListener{
    private MovieManagementPanel movieManagementPanel;
//    private MainFrame mainFrame;

//    public MovieManagementController(MainFrame mainFrame) {
//        this.mainFrame = mainFrame;
//        this.mainFrame.getMovieManagementPanel().setActionListener(this);
//    }
    
    public MovieManagementController(MovieManagementPanel movieManagementPanel) {
        this.movieManagementPanel = movieManagementPanel;
        movieManagementPanel.setActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String btn = e.getActionCommand();
        switch (btn) {
            case "Insert":
                movieManagementPanel.insertMovie();
                break;
            case "Edit":
                movieManagementPanel.editMovie();
                break;
            case "Delete":
                movieManagementPanel.deleteMovie();
                break;
            case "OK": 
                movieManagementPanel.saveMovie();
                
                break;
            case "Cancel":
                movieManagementPanel.refreshMovieInfor();
                break;
            default:
                break;
        }
    }
    
    
}
