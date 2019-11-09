package com.lcw.msgspringboot13cache.controller;

import com.lcw.msgspringboot13cache.entity.User;
import com.lcw.msgspringboot13cache.mapper.UserMapper;
import com.lcw.msgspringboot13cache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by chuanwen.li on 2019/8/12
 */

@RestController
public class UserController {

    @Autowired
    UserService userService;


    @RequestMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Integer id) {

        User user = userService.getUserById(id);
        return user;
    }

    @RequestMapping("/updateUser")
    public User update(User user) {
        userService.updateUser(user);
        return user;
    }

    @RequestMapping("/deleteUser/{id}")
    public Integer deleteUser(@PathVariable("id") Integer id) {

        userService.deleteUser(id);

        return id;
    }


}
