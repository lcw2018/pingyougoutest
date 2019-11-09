package com.lcw.msgspringboot09datajpa.controller;

import com.lcw.msgspringboot09datajpa.dao.UserRepository;
import com.lcw.msgspringboot09datajpa.entity.User;
import com.lcw.msgspringboot09datajpa.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by chuanwen.li on 2019/8/9
 */


@RestController
public class UserController {


    @Autowired
    UserRepository repository;

    @Autowired
    IUserService iUserService;

    @RequestMapping("/user/{id}")
    public User getUserByid(@PathVariable("id") Integer id) {

        User user = repository.findById(id).get();

        return user;


    }


    @RequestMapping("/user")
    public User addUser(User user) {

        repository.save(user);

        return user;
    }


    @RequestMapping("/user2")
    public User addUser2(User user) {


        iUserService.addUser(user);


        return user;
    }


}
