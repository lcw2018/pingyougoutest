package com.lcw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by chuanwen.li on 2019/7/19
 */


@RestController
public class HelloWorld {


    @RequestMapping("/hello")
    public String sayHello() {


        return "hello world!";

    }


}
