package com.lcw.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by chuanwen.li on 2019/4/12
 */


@RestController
public class Quick2Controller {

    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;

    @RequestMapping("/quick2")

    public String quick2() {

        return "hello springoot 测试成功！" + "name:" + name + "age:" + age;
    }


}
