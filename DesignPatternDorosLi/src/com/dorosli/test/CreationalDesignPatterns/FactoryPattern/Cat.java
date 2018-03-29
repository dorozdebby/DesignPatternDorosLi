package com.dorosli.test.CreationalDesignPatterns.FactoryPattern;

public class Cat extends Animal
{
    @Override
    public String makeSound() {
        return "Meow";
    }

}
