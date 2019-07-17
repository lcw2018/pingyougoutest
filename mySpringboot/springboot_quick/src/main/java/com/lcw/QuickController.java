package com.lcw;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by chuanwen.li on 2019/4/12
 */

@RestController
public class QuickController {


   @RequestMapping("/quick")
    public String quick() {


        return "hello springboot";
    }
}
