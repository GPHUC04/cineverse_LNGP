/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Objects;

/**
 *
 * @author ADMIN
 */
public class Ticket {
    private String tid;
    private Customer customer;
    private Schedule_model schedule;
    private LocalDateTime time;
    private String pay_method;
    private Seat seat;
    private boolean status;

    public Ticket() {
        this.tid = new String();
        this.customer = new Customer();
        this.schedule = new Schedule_model();
        this.time = LocalDateTime.of(2000, 1, 1, 0, 0);
        this.pay_method = new String();
        this.seat = new Seat();
        this.status = false;
    }

    public Ticket(String tid, Customer customer, Schedule_model schedule, LocalDateTime time, String pay_method, Seat seat, boolean status) {
        this.tid = tid;
        this.customer = customer;
        this.schedule = schedule;
        this.time = time;
        this.pay_method = pay_method;
        this.seat = seat;
        this.status = status;
    }

    public String getTid() {
        return tid;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Schedule_model getSchedule() {
        return schedule;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public String getPay_method() {
        return pay_method;
    }

    public Seat getSeat() {
        return seat;
    }

    public boolean isStatus() {
        return status;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setSchedule(Schedule_model schedule) {
        this.schedule = schedule;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public void setPay_method(String pay_method) {
        this.pay_method = pay_method;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.tid);
        hash = 41 * hash + Objects.hashCode(this.customer);
        hash = 41 * hash + Objects.hashCode(this.schedule);
        hash = 41 * hash + Objects.hashCode(this.time);
        hash = 41 * hash + Objects.hashCode(this.pay_method);
        hash = 41 * hash + Objects.hashCode(this.seat);
        hash = 41 * hash + (this.status ? 1 : 0);
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
        final Ticket other = (Ticket) obj;
        if (this.status != other.status) {
            return false;
        }
        if (!Objects.equals(this.tid, other.tid)) {
            return false;
        }
        if (!Objects.equals(this.pay_method, other.pay_method)) {
            return false;
        }
        if (!Objects.equals(this.customer, other.customer)) {
            return false;
        }
        if (!Objects.equals(this.schedule, other.schedule)) {
            return false;
        }
        if (!Objects.equals(this.time, other.time)) {
            return false;
        }
        return Objects.equals(this.seat, other.seat);
    }

    @Override
    public String toString() {
        return "Ticket{" + "tid=" + tid + ", customer=" + customer + ", schedule=" + schedule + ", time=" + time + ", pay_method=" + pay_method + ", seat=" + seat + ", status=" + status + '}';
    }
    
    
}
