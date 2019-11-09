package com.lcw.msgspringboot07tomcat.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by chuanwen.li on 2019/8/8
 */

@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String sayHello() {


        return "hello world!";

    }


}
