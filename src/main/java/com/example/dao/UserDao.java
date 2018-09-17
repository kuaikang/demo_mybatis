package com.example.dao;

import com.example.entity.User;

/**
 * @Author: kuaik
 * @Date: 2018-09-17
 * @Description:
 */
public interface UserDao {

    int saveUser(User user);

    User selectUserById(String id);
}
