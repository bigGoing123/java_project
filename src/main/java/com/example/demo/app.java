package com.example.demo;

import com.example.demo.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class app {
    public static void main(String[] args) {
        //获取IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.update();
        BookService bookService = ctx.getBean(BookService.class);
        bookService.save();
        UserDao userDao = (UserDao) ctx.getBean("userDao");
        userDao.save();

    }


}
