package com.musicstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by fardadyadegari on 12/7/2018.
 */
@Entity
public class Users {

    @Id
    @GeneratedValue
    private int UsersId;

    private String username;
    private String password;
    private boolean enabled;
    private int customerId;

    public int getUsersId() {
        return UsersId;
    }

    public void setUsersId(int usersId) {
        UsersId = usersId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
