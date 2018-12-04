package com.example.test;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @ClassName TestHashSet
 * @Description TODO
 * @Author kuaikang
 * @Date 2018/11/22 19:20:11
 * @Version 1.0
 */
public class TestHashSet {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>(16);
        for (int i = 0; i < 100; i++) {
            hashSet.add(i + "");
        }
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
