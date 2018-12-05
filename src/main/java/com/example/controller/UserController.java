package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @Author: kuaik
 * @Date: 2018-09-17
 * @Description:
 */
@RestController
@RequestMapping("user")
public class UserController {

    public static void main(String[] args) {
        System.out.println("master");
        System.out.println("master");
    }

    @Autowired
    private UserService userService;

    @PostMapping("insert")
    public String insert(@RequestBody User user){
        this.userService.saveUser(user);
        return "success";
    }

    @PostMapping("batchInsert")
    public String batchInsert(@RequestBody List<User> userList){
        if(CollectionUtils.isEmpty(userList)){
            return "param error";
        }
        this.userService.batchSaveUser(userList);
        return "success";
    }

    @PostMapping("selectUserById")
    public Object selectUserById(@RequestBody User user){
        if(StringUtils.isBlank(user.getId())){
            return "param error";
        }
        return this.userService.selectUserById(user.getId());
    }

    @PostMapping("getUserByName")
    public Object getUserByName(@RequestBody User user){
        if(StringUtils.isBlank(user.getUserName())){
            return "param error";
        }
        return this.userService.selectUserByName(user.getUserName());
    }

    @PostMapping("getUserByIdList")
    public Object getUserByIdLise(@RequestBody List<String> idList){
        if(CollectionUtils.isEmpty(idList)){
            return "param error";
        }
        return this.userService.selectByIdList(idList);
    }

    @PostMapping("getUserByIdOrUserName")
    public Object getUserByIdOrUserName(@RequestBody User user){
        return this.userService.selectByIdOrUserName(user);
    }

    @GetMapping("/testAllowMultiQueries")
    public String testAllowMultiQueries(){
        this.userService.updateMany();
        return "";
    }
}
