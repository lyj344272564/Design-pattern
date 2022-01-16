package com.richard.原型模式;

import com.sun.deploy.uitoolkit.impl.text.TextPluginUIFactory;

public class Plane implements Prototype{
    private String name;
    private String type;

    public Plane() {
        name = "Name" + Math.random();
        type = "Type" + Math.random();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plane(Plane plane) {
        this.name = plane.name;
        this.type = plane.type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Object clone() {
        return new Plane(this);
    }
}
