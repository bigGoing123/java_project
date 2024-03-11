package com.example.demo.service.impl;

import com.example.demo.dao.BookDao;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    public void save() {
        System.out.println("book service save123 ...");
//        bookDao.save();
    }
}
