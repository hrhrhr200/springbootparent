package com.huang.springcloud.controller;

import com.huang.springcloud.dao.UserDao;
import com.huang.springcloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserDao userDao;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id ) {
        User byId = this.userDao.findById(id).get();
        return byId;
    }
}
