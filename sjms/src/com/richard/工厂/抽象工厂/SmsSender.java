package com.richard.工厂.抽象工厂;

public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("Sms");
    }
}
