package com.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @ClassName MyDemo
 * @Description TODO
 * @Author kuaikang
 * @Date 2018/11/19 17:47:27
 * @Version 1.0
 */
public class MyDemo {

    public static void main(String[] args) throws Exception{
        String URL="jdbc:mysql://127.0.0.1:3306/personal?serverTimezone=GMT&useUnicode=true&characterEncoding=utf-8&useSSL=true";
        String USER="user";
        String PASSWORD="new_pass";
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获得数据库链接
        Connection conn=DriverManager.getConnection(URL, USER, PASSWORD);
        //3.通过数据库的连接操作数据库，实现增删改查（使用Statement类）
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select * from information.");
        //4.处理数据库的返回结果(使用ResultSet类)
        while(rs.next()) {
            System.out.println(rs.getString("userName")+" "+rs.getString("password"));
        }
        //关闭资源
        rs.close();
        st.close();
        conn.close();
    }
}
