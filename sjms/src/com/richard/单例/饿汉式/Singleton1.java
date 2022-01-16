package com.richard.单例.饿汉式;

/**
 * 饿汉式单例
 * 1、私有化构造方法
 * 2、指向自己实例的私有静态引用。
 * 3、以自己实例为返回值的静态的公有方法，静态工厂方法
 */
public class Singleton1 {
    private static Singleton1 singleton = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return singleton;
    }
}
