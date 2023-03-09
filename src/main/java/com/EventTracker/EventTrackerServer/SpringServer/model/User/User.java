package com.EventTracker.EventTrackerServer.SpringServer.model.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
@Entity
public class User{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int user_id;
    private String user_name;
    private String user_email_address;
    private String user_password;
    private String user_DOB;
    private int user_rep;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email_address() {
        return user_email_address;
    }

    public void setUser_email_address(String user_email_address) {
        this.user_email_address = user_email_address;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_DOB() {
        return user_DOB;
    }

    public void setUser_DOB(String user_DOB) {
        this.user_DOB = user_DOB;
    }

    public int getUser_rep() {
        return user_rep;
    }

    public void setUser_rep(int user_rep) {
        this.user_rep = user_rep;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_name='" + user_name + '\'' +
                ", user_email_address='" + user_email_address + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_DOB=" + user_DOB +
                ", user_rep=" + user_rep +
                '}';
    }
}
