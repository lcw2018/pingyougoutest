package com.lcw.msgspringboot09datajpa.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Create by chuanwen.li on 2019/8/9
 */

@Entity  //说明它是和数据表映射的类
@Table   //指定对应映射的表名，省略不写默认表名是类同 user
public class User {

    @Id   //指定主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //与数据表对应的一个字段
    private Integer id;


    @Column(name = "name", length = 5)
    private String name;

    @Column
    private String password;

    @Column//省略不写默认字段名就是属性名
    private String username;

    public User() {
    }

    public User(String name, String password, String username) {
        this.name = name;
        this.password = password;
        this.username = username;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
