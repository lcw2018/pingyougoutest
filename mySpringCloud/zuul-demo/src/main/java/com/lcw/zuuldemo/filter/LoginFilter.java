package com.lcw.zuuldemo.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Create by chuanwen.li on 2019/8/20
 */

@Component
public class LoginFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {


        //登录逻辑

        //获取zuul提供的请求上下文对象
        RequestContext rtc = RequestContext.getCurrentContext();


        //从上下文中获取到请求对象
        HttpServletRequest request = rtc.getRequest();

        //从请求中获取token

        String token = request.getParameter("access-token");

        //判断
        if (token == null || "".equals(token.trim())) {

            //没有token，登录检验失败，拦截
            rtc.setSendZuulResponse(false);

            //返回401状态码，也可考虑重定向到登录页
            rtc.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());


        }
        // 校验通过，可以考虑把用户信息放入上下文，继续向后执行
        return null;
    }
}
