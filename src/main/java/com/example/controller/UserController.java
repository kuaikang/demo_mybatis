package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: kuaik
 * @Date: 2018-09-17
 * @Description:
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("insert")
    public String insert(@RequestBody User user){
        System.out.println("111");
        this.userService.saveUser(user);
        return "success";
    }

    @ResponseBody
    @PostMapping("selectUserById")
    public Object selectUserById(@RequestBody User user){
        if(StringUtils.isBlank(user.getId())){
            return "param error";
        }
        return this.userService.selectUserById(user.getId());
    }
}
