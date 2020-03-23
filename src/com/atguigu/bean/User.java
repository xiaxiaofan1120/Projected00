package com.atguigu.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @create 2020-03-23 17:41
 */
public class User {

    public static final String number = "1000";

    public static void main(String[] args) {
        System.out.printf("hello");
        List list = new ArrayList();
        try {
            List arrayList = new ArrayList();
            list.add(1);
            list.add(1);
            list.add(1);
            list.add(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        list.add(1);
        list.add(1);

    }
}
