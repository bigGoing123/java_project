package com.example.demo.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    public static void main(String[] args) {

    }
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }
//    //加载springmvc配置类
//    protected WebApplicationContext createServletApplicationContext() {
//        //初始化WebApplicationContext对象
//        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//        //加载指定配置类
//        ctx.register(SpringMvcConfig.class);
//        return ctx;
//    }
//
//    //设置由springmvc控制器处理的请求映射路径
//    protected String[] getServletMappings() {
//        return new String[]{"/"};
//    }
//
//    //加载spring配置类
//    protected WebApplicationContext createRootApplicationContext() {
//        return null;
//    }
}