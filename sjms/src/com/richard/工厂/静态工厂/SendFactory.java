package com.richard.工厂.静态工厂;

public class SendFactory {
    public static Sender Mailproduce() {
        return new MailSender();
    }
    public static Sender Smsproduce() {
        return new SmsSender();
    }
}
