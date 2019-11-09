package com.lcw.msgspringboot04web.controller;

import com.lcw.msgspringboot04web.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Map;

/**
 * Create by chuanwen.li on 2019/8/15
 */


@Controller
public class HelloController {


    @RequestMapping("/execute")
    @ResponseBody
    public String execute() {


        return "hello world!";

    }


    @RequestMapping("/success")
    public String success(Map<String, Object> map) {

        map.put("name", "王小七");

        //classpath:/templates/success.html
        return "success";


    }


    @RequestMapping("/study")
    public String study(Map<String, Object> map, HttpServletRequest request) {


        ArrayList<User> userList = new ArrayList<>();

        userList.add(new User("小七", 1));
        userList.add(new User("小段", 2));
        userList.add(new User("小娜", 1));

        map.put("userList", userList);

        //1 女， 2 男
        map.put("man", 2);
        map.put("sex", 2);


        map.put("desc", "欢迎来到<h2>我的世界</h2>");

        //将user对象绑定到session中
        request.getSession().setAttribute("user", new User("库里", 1));


        return "study";
    }


}
