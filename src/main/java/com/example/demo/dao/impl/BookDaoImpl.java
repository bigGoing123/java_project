package com.example.demo.dao.impl;

import com.example.demo.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {

    public void save() {
        System.out.println(System.currentTimeMillis());
        System.out.println("book dao save..");
    }
    public void update() {
        System.out.println("book dao update..");
    }
}
