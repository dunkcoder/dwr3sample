package com.dunkcoder.dwr3sample.service;

import com.dunkcoder.dwr3sample.model.User;

public class UserService {

    public User getUser() throws Exception {
        User user = new User();
        user.setId(1);
        user.setUsername("dwr3.sample");
        user.setEmail("dwr3.sample@dunkcoder");
        return user;
    }
}