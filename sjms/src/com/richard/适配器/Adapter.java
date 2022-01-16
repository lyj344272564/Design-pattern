package com.richard.适配器;

public class Adapter implements Translator{
    private Speaker speaker;

    public Adapter(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public String translate() {
        String res = speaker.speak();
        return res;
    }
}
