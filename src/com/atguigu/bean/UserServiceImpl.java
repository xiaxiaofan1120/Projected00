package com.atguigu.bean;

/**
 * @author Administrator
 * @create 2020-03-23 17:52
 */
public class UserServiceImpl implements UserService {
    @Override
    public void insert(Integer id, String name) {
        System.out.println(id);
        System.out.println("id = " + id + ", name = " + name);
        System.out.println("id = " + id);
    }
}
