package com.richard.工厂.抽象工厂;

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("Mail");
    }
}
