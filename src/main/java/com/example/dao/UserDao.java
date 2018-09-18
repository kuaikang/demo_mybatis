package com.example.dao;

import com.example.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: kuaik
 * @Date: 2018-09-17
 * @Description:
 */
public interface UserDao {

    int saveUser(User user);

    User selectUserById(String id);

    List<User> selectUserByName(@Param("userName") String userName);

    void batchSaveUser(List<User> userList);

    List<User> selectByIdList(List<String> idList);
}
