package com.example.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: kuaik
 * @Date: 2018-09-13
 * @Description:
 */
public class User implements Serializable {

    private  String id;

    private String userName;

    private String sex;

    private String phone;

    private Date createTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUserName() {
        return userName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
