package com.example.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Test
 * @Description TODO
 * @Author kuaikang
 * @Date 2018/11/15 15:58:46
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("start", new Integer(10));
        System.out.println((int) map.get("start"));
    }
}
