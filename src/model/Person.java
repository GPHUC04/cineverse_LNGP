/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author ADMIN
 */
public class Person {
    private String name;
    private String email;
    private int phone;
    private LocalDate dob;

    public Person() {
        name = new String();
        email = new String();
        phone = 0;
        dob = LocalDate.of(2000,1,1);
    }

    public Person(String name, String email, int phone, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.email);
        hash = 89 * hash + this.phone;
        hash = 89 * hash + Objects.hashCode(this.dob);
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
        final Person other = (Person) obj;
        if (this.phone != other.phone) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return Objects.equals(this.dob, other.dob);
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", email=" + email + ", phone=" + phone + ", dob=" + dob + '}';
    }
    
    
    
}
