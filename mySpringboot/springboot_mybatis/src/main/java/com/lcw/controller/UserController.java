package com.lcw.controller;

import com.lcw.dao.UserDao;
import com.lcw.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Create by chuanwen.li on 2019/4/12
 */

@Controller
public class UserController {

    @Autowired
    UserDao userDao;
    @RequestMapping("/user")
    @ResponseBody
    public List<User> findAll() {
        List<User> users = userDao.queryUserList();
        return users;

    }


}
