package com.marktsai.sprintbootmall.service;

import com.marktsai.sprintbootmall.dto.UserLoginRequest;
import com.marktsai.sprintbootmall.dto.UserRegisterRequest;
import com.marktsai.sprintbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
