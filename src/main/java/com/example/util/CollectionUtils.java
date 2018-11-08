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

    }
}
