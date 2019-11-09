package com.lcw.msgspringboot11task.Controller;

import com.lcw.msgspringboot11task.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by chuanwen.li on 2019/8/10
 */


@RestController
public class AsyncController {


    @Autowired
    AsyncService asyncService;

    @RequestMapping("/add")
    public String batchAdd() {

        asyncService.batchAdd();

        return "success";


    }


}
