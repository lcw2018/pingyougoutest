package com.lcw;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by chuanwen.li on 2019/8/1
 */


@RestController
public class InitalController {


    @RequestMapping("/inital")
    public String inital() {


        return "inital...";

    }


}
