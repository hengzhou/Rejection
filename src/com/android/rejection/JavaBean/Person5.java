package com.android.rejection.JavaBean;

/**
 * Created by Administrator on 2016/8/19.
 */
public class Person5 implements China {
    private String Sex;

    public Person5() {
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    @Override
    public void sayChina() {
        System.out.println("hello , China");
    }

    @Override
    public void sayHello(String name, int age) {
        System.out.println(name + " " + age);
    }
}
