package com.example.test;

import java.lang.annotation.*;

/**
 * @ClassName LogAnnotation
 * @Description TODO
 * @Author kuaikang
 * @Date 2018/11/21 17:36:44
 * @Version 1.0
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface LogAnnotation {

    String desc();
}
