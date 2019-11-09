package com.lcw.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Create by chuanwen.li on 2019/8/5
 */


@RestController
public class EmpController {


    @Value("${emp.last-name}")
    private String name;


    @RequestMapping("/say")
    public String sayHello() {


        return "你好！" + name;


    }


}
