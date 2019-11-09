package com.lcw;

import com.lcw.bean.Emp;
import com.lcw.service.EmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Create by chuanwen.li on 2019/8/4
 */


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ConfigTest {


    @Autowired
    ApplicationContext applicationContext;


    @Test
    public void xmlTest() {

        // Object bean = applicationContext.getBean("empService");

        // System.out.println("empService:"+bean);

        // applicationContext.getBean("getService", EmpService.class).add();

        System.out.println("empService:" + applicationContext.getBean("getService"));
    }


    @Autowired
    Emp emp;


    @Test
    public void contextLoads() {


        System.out.println(emp);


    }


}
