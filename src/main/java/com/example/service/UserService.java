package com.example.service;

import com.example.entity.User;

/**
 * @Author: kuaik
 * @Date: 2018-09-17
 * @Description:
 */
public interface UserService {

    void saveUser(User user);

    User selectUserById(String id);
}
