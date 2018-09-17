package com.example.util;

/**
 * @author ji.shuaijun
 * @date 2018-01-26
 */
public class UUID {

    public static String get() {
        return java.util.UUID.randomUUID().toString().replaceAll("-", "");
    }
}
