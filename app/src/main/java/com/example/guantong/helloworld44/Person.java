package com.example.guantong.helloworld44;

/**
 * Created by Guantong on 3/14/2015.
 */
public class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    public String sayHello() {
        return (getName() + "," + getAge());
    }
}
