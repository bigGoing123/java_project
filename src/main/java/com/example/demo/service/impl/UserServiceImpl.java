package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public void save() {
        System.out.println("book service save ...");
        userDao.save();
    }

}
