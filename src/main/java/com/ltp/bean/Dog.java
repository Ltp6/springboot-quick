package com.ltp.bean;

/**
 * @ClassName Dog
 * @Auther: Ltp
 * @Date: 19-3-21 上午11:17
 * @Description:
 */

public class Dog {
    private String name;
    private int age;
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
