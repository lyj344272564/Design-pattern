package com.richard.责任链;

public class Boss extends Handler{
    @Override
    public void process(Integer info) {
        System.out.println("Boss 处理");
    }
}
