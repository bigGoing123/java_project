package com.example.demo.dao.impl;

import com.example.demo.dao.UserDao;

public class UserDaoImpl implements UserDao {
    public void save(){
        System.out.println("userdao save ...");
    }

    @Override
    public void init() {
        System.out.println("init..");
    }

    @Override
    public void destroy() {
        System.out.println("destroy..");
    }
}
