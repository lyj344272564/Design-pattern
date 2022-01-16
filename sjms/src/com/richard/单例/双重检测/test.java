package com.richard.单例.双重检测;

public class test {
    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i=0; i<5; i++) {
                        Singleton3 instance = Singleton3.getInstance();
                        System.out.println(instance);
                    }
                }
            });
            t.start();
        }
    }
}
