package com.richard.工厂.静态工厂;

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("Mail");
    }
}
