package com.richard.代理;

public class RealSubjectProxy implements Subject{
    private RealSubject realSubject;

    public RealSubjectProxy() {
        try {
            this.realSubject = (RealSubject) this.getClass().getClassLoader().loadClass("com.richard.代理.RealSubject").newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void connect() {
        System.out.println("建立连接");
    }

    public void log() {
        System.out.println("日志记录");
    }

    @Override
    public void doWork() {
        connect();
        realSubject.doWork();
        log();
    }
}
