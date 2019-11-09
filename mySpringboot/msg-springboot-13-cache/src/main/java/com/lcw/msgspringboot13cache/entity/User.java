package com.lcw.msgspringboot13cache.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Create by chuanwen.li on 2019/8/12
 * <p>
 * <p>
 * 用户实体类
 */
public class User implements Serializable {

    private Integer id;

    //用户名
    private String username;

    //用户真实姓名
    private String realName;


    //密码
    private String password;


    //性别  1为女，2为男

    private Integer gender;


    //生日

    private Date birthday;


    //用户类型。1 管理员 2 经理 3 普通员工

    private Integer userType;


    public User() {
    }


    public User(String username, Integer gender) {
        this.username = username;
        this.gender = gender;
    }

    public User(Integer id, String username, String realName, String password, Integer gender, Date birthday, Integer userType) {
        this.id = id;
        this.username = username;
        this.realName = realName;
        this.password = password;
        this.gender = gender;
        this.birthday = birthday;
        this.userType = userType;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", realName='" + realName + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", userType=" + userType +
                '}';
    }
}
