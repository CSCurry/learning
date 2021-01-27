package com.example.entity;

import lombok.Data;

@Data
public class Person {

    private String name;
    private Integer age;
    private String address;

    public void run() {
        System.out.println("跑步");
    }
}
