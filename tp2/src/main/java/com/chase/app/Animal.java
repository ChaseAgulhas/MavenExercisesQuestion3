package com.chase.app;

/**
 * Created by Chase Agulhas on 2016/03/15.
 */
public abstract class Animal {

    private String name;

    public Animal(String name)
    {
        this.name = name;
    }

    public void myNameIs()
    {
        System.out.println("My name is " + name);
    }

    abstract public void move();


}

