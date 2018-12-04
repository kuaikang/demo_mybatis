package com.example.controller;

import com.example.test.LogAnnotation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestAspectController
 * @Description TODO
 * @Author kuaikang
 * @Date 2018/11/21 17:40:27
 * @Version 1.0
 */
@RestController("/aspect")
public class TestAspectController {

    @LogAnnotation(desc = "自定义注解")
    @RequestMapping("test")
    public void test() {
        System.out.println("测试");
    }
}
