package com.lcw.msgspringboot08datajdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Create by chuanwen.li on 2019/8/8
 */

@RestController
public class ProviderController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/list")
    public List<Map<String, Object>> list() {


        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from user");


        System.out.println(maps);


        return maps;

    }


}
