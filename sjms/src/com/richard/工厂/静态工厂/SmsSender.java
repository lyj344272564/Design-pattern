package com.richard.工厂.静态工厂;

public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("Sms");
    }
}
