package com.lcw.config;

import com.lcw.filter.MyFilter;
import com.lcw.listener.MyListener;
import com.lcw.servlet.MyServlet;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * Create by chuanwen.li on 2019/8/8
 */


@Configuration
public class MyServletConfig {

    @Bean
    public WebServerFactoryCustomizer webServerFactoryCustomizer() {


        return new WebServerFactoryCustomizer() {
            @Override
            public void customize(WebServerFactory factory) {


                ConfigurableServletWebServerFactory factory1 = (ConfigurableServletWebServerFactory) factory;
                //修改端口号,如果配置文件中与定制器中的配置冲突，默认采用定制器的配置
                factory1.setPort(8088);
                factory1.setContextPath("/servlet2");

            }
        };


    }

    //注册servlet
   @Bean
    public ServletRegistrationBean helloServlet() {

        ServletRegistrationBean bean = new ServletRegistrationBean(new MyServlet(), "/hello");

        bean.setLoadOnStartup(1);

        return bean;


    }


    //注册filter
     @Bean
    public FilterRegistrationBean helloFilter() {


        FilterRegistrationBean bean = new FilterRegistrationBean();

        //设置自定义过滤器
        bean.setFilter(new MyFilter());


        //设置过滤哪一些请求
        bean.setUrlPatterns(Arrays.asList("/hello"));

        return bean;
    }


    //注册listener
    @Bean
    public ServletListenerRegistrationBean helloLisrtener() {


        ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean();

        //设置自定义监听器
        bean.setListener(new MyListener());

        return bean;
    }


}





