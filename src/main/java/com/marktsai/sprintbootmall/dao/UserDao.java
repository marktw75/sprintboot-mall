package com.marktsai.sprintbootmall.dao;

import com.marktsai.sprintbootmall.dto.UserRegisterRequest;
import com.marktsai.sprintbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
