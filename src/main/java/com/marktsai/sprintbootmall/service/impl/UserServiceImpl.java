package com.marktsai.sprintbootmall.service.impl;

import com.marktsai.sprintbootmall.dao.UserDao;
import com.marktsai.sprintbootmall.dto.UserRegisterRequest;
import com.marktsai.sprintbootmall.model.User;
import com.marktsai.sprintbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}