package com.lcw.listener;

import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Create by chuanwen.li on 2019/8/8
 */
public class MyListener implements ServletContextListener {


    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        System.out.println("springboot.servlet应用启动...");

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

        System.out.println("springboot.servlet应用结束...");


    }
}
