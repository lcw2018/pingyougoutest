package com.lcw;


import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.WebResource;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

import javax.net.ssl.StandardConstants;
import javax.servlet.ServletException;
import java.io.File;

import static sun.misc.PostVMInitHook.run;

public class SpringbootDesign {


    public static void main(String[] args) throws ServletException, LifecycleException {
        appRun();


    }

    private static void appRun() throws ServletException, LifecycleException {

        //创建tomcat容器
        Tomcat tomcatServer = new Tomcat();

        //设置tomcat的端口号
        tomcatServer.setPort(8090);
        //读取项目路径
        StandardContext tx = (StandardContext) tomcatServer.addWebapp("/", new File("src/main").getAbsolutePath());
        //禁止重新载入
        tx.setReloadable(false);

        File additionWebInfClasses = new File("target/classes");

        WebResourceRoot resources = new StandardRoot(tx);
        resources.addPreResources(new DirResourceSet(resources, "/WEB-INF/classes", additionWebInfClasses.getAbsolutePath(), "/"));
        tomcatServer.start();
        tomcatServer.getServer().await();
    }
}
