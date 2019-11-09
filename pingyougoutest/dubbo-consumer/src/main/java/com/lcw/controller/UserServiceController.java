package com.lcw.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lcw.service.impl.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by chuanwen.li on 2019/11/5
 */


@RestController
@RequestMapping("user")
public class UserServiceController {


    @Reference
    UserService userService;


    @RequestMapping("/name")
    public String getName() {


        String name = userService.getName();


        return name;
    }


}
