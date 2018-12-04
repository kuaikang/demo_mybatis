package com.example.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @ClassName ControllerAspect
 * @Description TODO
 * @Author kuaikang
 * @Date 2018/11/21 17:32:59
 * @Version 1.0
 */
@Aspect
@Component
public class ControllerAspect {

    @AfterReturning("within(com.example..*) && @annotation(rl)")
    public void addLogSuccess(JoinPoint jp, LogAnnotation rl) {
        Object[] parames = jp.getArgs();//获取目标方法体参数
        for (int i = 0; i < parames.length; i++) {
            System.out.println(parames[i]);
        }
        System.out.println(jp.getSignature().getName());
        String className = jp.getTarget().getClass().toString();//获取目标类名
        System.out.println("className:" + className);
        String signature = jp.getSignature().toString();//获取目标方法签名
        System.out.println("signature:" + signature);
    }
}