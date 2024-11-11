/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author ADMIN
 */
public class Staff {
    private Person person;
    private String sid;
    private String roll;
    private int salary;
    private Date enroll_date;

    public Staff() {
        person = new Person();
        sid = new String();
        roll = new String();
        salary = 0;
        enroll_date = new Date();
    }

    public Staff(Person person, String sid, String roll, int salary, Date enroll_date) {
        this.person = person;
        this.sid = sid;
        this.roll = roll;
        this.salary = salary;
        this.enroll_date = enroll_date;
    }

    public Person getPerson() {
        return person;
    }

    public String getSid() {
        return sid;
    }

    public String getRoll() {
        return roll;
    }

    public int getSalary() {
        return salary;
    }

    public Date getEnroll_date() {
        return enroll_date;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setEnroll_date(Date enroll_date) {
        this.enroll_date = enroll_date;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.person);
        hash = 41 * hash + Objects.hashCode(this.sid);
        hash = 41 * hash + Objects.hashCode(this.roll);
        hash = 41 * hash + this.salary;
        hash = 41 * hash + Objects.hashCode(this.enroll_date);
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
        final Staff other = (Staff) obj;
        if (this.salary != other.salary) {
            return false;
        }
        if (!Objects.equals(this.sid, other.sid)) {
            return false;
        }
        if (!Objects.equals(this.roll, other.roll)) {
            return false;
        }
        if (!Objects.equals(this.person, other.person)) {
            return false;
        }
        return Objects.equals(this.enroll_date, other.enroll_date);
    }

    @Override
    public String toString() {
        return "Staff{" + "person=" + person + ", sid=" + sid + ", roll=" + roll + ", salary=" + salary + ", enroll_date=" + enroll_date + '}';
    }
    
    
    
}
