package com.example;

import com.example.entity.Person;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception {
        //### 获取类的 Class 对象（3种方式）
        //1.类名.class                这种获取方式只有在编译前已经声明了该类的类型才能获取到 Class 对象
        //2.实例.getClass()           通过实例化对象获取该实例的 Class 对象
        //3.Class.forName(className)  通过类的全限定名获取该类的 Class 对象

        Class<? extends Person> clazz1 = Person.class;

        Person p = new Person();
        Class<? extends Person> clazz2 = p.getClass();

        Class<?> clazz3 = Class.forName("com.example.entity.Person");

        //###  JVM 保证了一个类在内存中最多存在一个 Class 对象
        //所以以下结果全为true
        System.out.println(clazz1 == clazz2);
        System.out.println(clazz2 == clazz3);
        System.out.println(clazz1 == clazz3);

        Person person = clazz1.newInstance();
        person.run();

        Method[] methods = clazz1.getMethods();
        System.out.println(methods);
    }
}
