package com.dorosli.test.CreationalDesignPatterns.PrototypePattern;

public class Dog implements Prototype
{
    String sound;

    public Dog(String sound)
    {
        this.sound = sound;
    }

    @Override
    public Prototype doClone()
    {
        return new Dog(sound);
    }

    @Override
    public String toString()
    {
        return "This dog says " + sound;
    }
}
