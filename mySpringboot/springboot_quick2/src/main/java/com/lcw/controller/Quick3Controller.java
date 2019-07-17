package com.lcw.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by chuanwen.li on 2019/4/12
 */
@RestController
@Component
@ConfigurationProperties(prefix = "person")
public class Quick3Controller {


    private String name;

    private int age;

    //@ResponseBody
    @RequestMapping("/quick3")

    public String quick3() {



        return "hello springboot!恭喜测试成功!" + name + ":" + age;


    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
