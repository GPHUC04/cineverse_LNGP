/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import view.HomePagePanel;
import view.MainFrame;

/**
 *
 * @author ADMIN
 */
public class HomePageController implements MouseListener{
    private MainFrame mainFrame;
    
    public HomePageController(MainFrame mainFrame){
        this.mainFrame = mainFrame;
        mainFrame.setHeaderMouseListener(this);
        mainFrame.getHomePagePanel().setMouseListener(this);
        mainFrame.getSideBar().setMouseListener(this);
//        MovieManagementController movieManagementController = new MovieManagementController(mainFrame);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
         
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Object source = e.getSource();
        
        if (source == mainFrame.getBtn_menu()) {
            mainFrame.activeSideBar();
        } else if (source == mainFrame.getHomePagePanel().getBtn_home()) {
            mainFrame.showPanel("homePage");
        } else if (source == mainFrame.getHomePagePanel().getBtn_findMovie()) {
            mainFrame.showPanel("findMovie");
        } else if (source == mainFrame.getHomePagePanel().getBtn_movie()) {
            mainFrame.showPanel("movies");
        } else if (source == mainFrame.getHomePagePanel().getBtn_screenRoom()) {
            mainFrame.showPanel("screenRoom");
        } else if (source == mainFrame.getHomePagePanel().getBtn_staff()) {
            mainFrame.showPanel("staff");
        } else if (source == mainFrame.getHomePagePanel().getBtn_showTime()) {
            mainFrame.showPanel("showTime");
        } else if (source == mainFrame.getHomePagePanel().getBtn_ticket()) {
            mainFrame.showPanel("ticket");
        } else if (source == mainFrame.getHomePagePanel().getBtn_account()) {
            mainFrame.showPanel("account");
        } else if (source == mainFrame.getHomePagePanel().getBtn_statistic()) {
            mainFrame.showPanel("statistic");
        } else if (source == mainFrame.getSideBar().getBtn_exit()) {
            mainFrame.inactiveSideBar();
        } 
        //sidebar
        else if (source == mainFrame.getSideBar().getBtn_home()) {
            mainFrame.showPanel("homePage");
        } else if (source == mainFrame.getSideBar().getBtn_findMovie()) {
            mainFrame.showPanel("findMovie");
        } else if (source == mainFrame.getSideBar().getBtn_movie()) {
            mainFrame.showPanel("movies");
        } else if (source == mainFrame.getSideBar().getBtn_screenRoom()) {
            mainFrame.showPanel("screenRoom");
        } else if (source == mainFrame.getSideBar().getBtn_staff()) {
            mainFrame.showPanel("staff");
        } else if (source == mainFrame.getSideBar().getBtn_showTime()) {
            mainFrame.showPanel("showTime");
        } else if (source == mainFrame.getSideBar().getBtn_ticket()) {
            mainFrame.showPanel("ticket");
        } else if (source == mainFrame.getSideBar().getBtn_account()) {
            mainFrame.showPanel("account");
        } else if (source == mainFrame.getSideBar().getBtn_statistic()) {
            mainFrame.showPanel("statistic");
        } 
    }

    @Override
    public void mouseExited(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
