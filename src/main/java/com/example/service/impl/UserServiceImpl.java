package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.entity.User;
import com.example.service.UserService;
import com.example.util.UUID;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: kuaik
 * @Date: 2018-09-17
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;


    @Override
    public void saveUser(User user) {
        user.setId(UUID.get());
        this.userDao.saveUser(user);
    }


    @Override
    public User selectUserById(String id) {
        return this.userDao.selectUserById(id);
    }

    @Override
    public void batchSaveUser(List<User> userList) {
        for (User user : userList) {
            user.setId(UUID.get());
        }
        this.userDao.batchSaveUser(userList);
    }
}
