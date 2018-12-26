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

    @Override
    public List<User> selectUserByName(String userName) {
        return this.userDao.selectUserByName(userName);
    }

    @Override
    public List<User> selectByIdList(List<String> idList) {
        return this.userDao.selectByIdList(idList);
    }

    @Override
    public User selectByIdOrUserName(User user) {
        return this.userDao.selectByIdOrUserName(user);
    }

    @Override
    public void updateMany() {
        this.userDao.updateMany();
    }
}
