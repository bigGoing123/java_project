package com.example.demo.factory;

import com.example.demo.dao.UserDao;
import com.example.demo.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactory implements FactoryBean<UserDao> {
    //代替原始实例工厂中创建对象的方法
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    //返回所创建类的Class对象
    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }
}
