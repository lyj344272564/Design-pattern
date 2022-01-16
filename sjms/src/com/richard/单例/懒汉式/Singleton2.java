package com.richard.单例.懒汉式;

/**
 * 懒汉式单例
 */
public class Singleton2 {
    private static Singleton2 singleton2;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (null == singleton2) {
            return new Singleton2();
        }
        return singleton2;
    }
}
