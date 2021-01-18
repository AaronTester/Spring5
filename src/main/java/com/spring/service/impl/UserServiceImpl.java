package com.spring.service.impl;

import com.spring.service.UserService;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/11/30
 */
public class UserServiceImpl implements UserService {
    @Override
    public int add(int x, int y) {
        System.out.println("**********加法*******");
        return x + y;
    }

    @Override
    public int sub(int x, int y) {
        System.out.println("**********减法*******");
        return x-y;
    }

    @Override
    public int mul(int x, int y) {
        System.out.println("**********乘法*******");
        return x*y;
    }

    @Override
    public int div(int x, int y) {
        System.out.println("**********除法*******");
        return x/y;
    }
}
