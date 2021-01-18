package com.spring.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/11/30
 */
public class ReturnLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(method.getClass().getName()+"的方法："+method.getName()+"开始执行");
        System.out.println("参数："+args);
        System.out.println("目标："+target);
        System.out.println("返回值："+returnValue);
    }
}
