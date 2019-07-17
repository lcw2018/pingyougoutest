package com.lcw.controller;

import com.lcw.domain.User;
import com.lcw.dao.UserMapper;
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
    UserMapper userMapper;

    @ResponseBody
    @RequestMapping("/findUser")
    public List<User> userList() {

        List<User> users = userMapper.findAllUser();
        return users;


    }
}
