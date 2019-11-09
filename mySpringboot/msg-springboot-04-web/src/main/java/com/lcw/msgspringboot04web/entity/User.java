package com.lcw.msgspringboot04web.entity;

import java.io.Serializable;

/**
 * Create by chuanwen.li on 2019/8/15
 */
public class User  implements Serializable {



    private  String username;


    private Integer gender;


    public User() {
    }


    public User(String username, Integer gender) {
        this.username = username;
        this.gender = gender;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", gender=" + gender +
                '}';
    }
}
