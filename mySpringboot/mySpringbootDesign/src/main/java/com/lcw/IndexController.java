package com.lcw;


import com.lcw.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {


    @Autowired
    IndexService indexService;
    @RequestMapping("/hello")
    public String pageIndex() {


        return indexService.pageService();


    }


}
