/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

/**
 *
 * @author ADMIN
 */
public class Schedule_model {
    private String scid; // Thêm trường scid
    private String mid; // Thêm trường mid
    private String rid; // Thêm trường rid
    private LocalDate sdate; // Thay đổi tên trường từ time sang sdate
    private LocalTime stime; // Thêm trường stime
    private float price;

    public Schedule_model() {
        this.scid = "";
        this.mid = "";
        this.rid = "";
        this.sdate = LocalDate.of(2000, 1, 1);
        this.stime = LocalTime.of(0, 0, 0);
        this.price = 0;
    }

    public Schedule_model(String scid, String mid, String rid, LocalDate sdate, LocalTime stime, float price) {
        this.scid = scid;
        this.mid = mid;
        this.rid = rid;
        this.sdate = sdate;
        this.stime = stime;
        this.price = price;
    }

    // Thêm các phương thức get/set cho các trường mới
    public String getScid() {
        return scid;
    }

    public void setScid(String scid) {
        this.scid = scid;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public LocalDate getSdate() {
        return sdate;
    }

    public void setSdate(LocalDate sdate) {
        this.sdate = sdate;
    }

    public LocalTime getStime() {
        return stime;
    }

    public void setStime(LocalTime stime) {
        this.stime = stime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.scid);
        hash = 79 * hash + Objects.hashCode(this.mid);
        hash = 79 * hash + Objects.hashCode(this.rid);
        hash = 79 * hash + Objects.hashCode(this.sdate);
        hash = 79 * hash + Objects.hashCode(this.stime);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
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
        final Schedule_model other = (Schedule_model) obj;
        if (Float.floatToIntBits(this.price) != Float.floatToIntBits(other.price)) {
            return false;
        }
        if (!Objects.equals(this.scid, other.scid)) {
            return false;
        }
        if (!Objects.equals(this.mid, other.mid)) {
            return false;
        }
        if (!Objects.equals(this.rid, other.rid)) {
            return false;
        }
        if (!Objects.equals(this.sdate, other.sdate)) {
            return false;
        }
        return Objects.equals(this.stime, other.stime);
    }

    @Override
    public String toString() {
        return "Schedule{" + "scid=" + scid + ", mid=" + mid + ", rid=" + rid + ", sdate=" + sdate + ", stime=" + stime + ", price=" + price + '}';
    }
} 