package com.lcw.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Create by chuanwen.li on 2019/8/8
 */
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.println("filter初始化");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("filter过滤器");

        filterChain.doFilter(servletRequest, servletResponse);

    }

    @Override
    public void destroy() {

        System.out.println("filter撤销");


    }
}
