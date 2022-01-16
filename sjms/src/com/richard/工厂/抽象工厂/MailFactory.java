package com.richard.工厂.抽象工厂;

public class MailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
