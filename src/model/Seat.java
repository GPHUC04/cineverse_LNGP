/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author ADMIN
 */
public class Seat {
    private String seat_id, type;
    private boolean status;
    
    public Seat(){
        seat_id = new String();
        type = new String();
        status = false;
    }

    public Seat(String seat_id, String type, boolean status) {
        this.seat_id = seat_id;
        this.type = type;
        this.status = status;
    }

    public String getSeat_id() {
        return seat_id;
    }

    public String getType() {
        return type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setSeat_id(String seat_id) {
        this.seat_id = seat_id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.seat_id);
        hash = 59 * hash + Objects.hashCode(this.type);
        hash = 59 * hash + (this.status ? 1 : 0);
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
        final Seat other = (Seat) obj;
        if (this.status != other.status) {
            return false;
        }
        if (!Objects.equals(this.seat_id, other.seat_id)) {
            return false;
        }
        return Objects.equals(this.type, other.type);
    }

    @Override
    public String toString() {
        return "Seat{" + "seat_id=" + seat_id + ", type=" + type + ", status=" + status + '}';
    }
    
    
}
