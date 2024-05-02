package edu.iu.gsackie.C322Final.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "flowers", name = "customer")
public class Customer {
    @Id

    String username;
    String password;

    String email;


    public Customer(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;

    }

    public Customer() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }









}
