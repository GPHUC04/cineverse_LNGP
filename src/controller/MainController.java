/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.MainFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ADMIN
 */
public class MainController implements ActionListener{
    private MainFrame mainFrame;
    private MovieManagementController movieManagementController;
    private HomePageController homePageController;

    public MainController(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        
        homePageController = new HomePageController(mainFrame);
        movieManagementController = new MovieManagementController(mainFrame.getMovieManagementPanel());
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
}
