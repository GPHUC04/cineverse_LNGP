/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author ADMIN
 */
public class CineVerseModel {
    private List<Staff> staffs;
    private List<Customer> customers;
    private List<ScreenRoom> screenRooms;
    private List<Movie> movies;
    private List<Schedule_model> schedules;
    private List<Ticket> tickets;

    public CineVerseModel() {
        this.staffs = new ArrayList<Staff>();
        this.customers = new ArrayList<Customer>();
        this.screenRooms = new ArrayList<ScreenRoom>();
        this.movies = new ArrayList<Movie>();
        this.schedules = new ArrayList<Schedule_model>();
        this.tickets = new ArrayList<Ticket>();
    }

    public CineVerseModel(List<Staff> staffs, List<Customer> customers, List<ScreenRoom> screenRooms, List<Movie> movies, List<Schedule_model> schedules, List<Ticket> tickets) {
        this.staffs = staffs;
        this.customers = customers;
        this.screenRooms = screenRooms;
        this.movies = movies;
        this.schedules = schedules;
        this.tickets = tickets;
    }

    public List<Staff> getStaffs() {
        return staffs;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<ScreenRoom> getScreenRooms() {
        return screenRooms;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public List<Schedule_model> getSchedules() {
        return schedules;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setStaffs(List<Staff> staffs) {
        this.staffs = staffs;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public void setScreenRooms(List<ScreenRoom> screenRooms) {
        this.screenRooms = screenRooms;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public void setSchedules(List<Schedule_model> schedules) {
        this.schedules = schedules;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.staffs);
        hash = 13 * hash + Objects.hashCode(this.customers);
        hash = 13 * hash + Objects.hashCode(this.screenRooms);
        hash = 13 * hash + Objects.hashCode(this.movies);
        hash = 13 * hash + Objects.hashCode(this.schedules);
        hash = 13 * hash + Objects.hashCode(this.tickets);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CineVerseModel other = (CineVerseModel) obj;
        if (!Objects.equals(this.staffs, other.staffs)) {
            return false;
        }
        if (!Objects.equals(this.customers, other.customers)) {
            return false;
        }
        if (!Objects.equals(this.screenRooms, other.screenRooms)) {
            return false;
        }
        if (!Objects.equals(this.movies, other.movies)) {
            return false;
        }
        if (!Objects.equals(this.schedules, other.schedules)) {
            return false;
        }
        return Objects.equals(this.tickets, other.tickets);
    }

    @Override
    public String toString() {
        return "CineVerseModel{" + "staffs=" + staffs + ", customers=" + customers + ", screenRooms=" + screenRooms + ", movies=" + movies + ", schedules=" + schedules + ", tickets=" + tickets + '}';
    }
    
    
}
