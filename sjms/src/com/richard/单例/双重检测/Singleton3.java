package com.richard.单例.双重检测;

/**
 * 双重检测
 */
public class Singleton3 {
    // 静态成员变量:在类加载的时候就会初始化,类加载完成,变量已经初始化结束。 非静态成员变量:它是在对象的创建过程中被初始化。正常写是加的
    private static volatile Singleton3 singleton3 = null;

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        if (null == singleton3) {
            synchronized (Singleton3.class) {
                if (null == singleton3) {
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }
}
