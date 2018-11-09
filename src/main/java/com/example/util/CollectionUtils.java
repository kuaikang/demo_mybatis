package com.example.util;

import java.util.Collection;

/**
 * @Author: kuaik
 * @Date: 2018-09-19
 * @Description:
 */
public class CollectionUtils {

    public static boolean isEmpty(Collection<?> collection){
        return collection.isEmpty() || collection == null;
    }

    public static boolean isNotEmpty(Collection<?> collection){
        return !isEmpty(collection);
    }
    public void set(){
        System.out.println("AAAAA");
    	System.out.println("BBB");
        System.out.println("CCC");
    }

    public void get(){
        System.out.println("ABC");
    }
}
