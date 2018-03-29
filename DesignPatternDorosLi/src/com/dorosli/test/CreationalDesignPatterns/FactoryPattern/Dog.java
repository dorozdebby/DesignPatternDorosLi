package com.dorosli.test.CreationalDesignPatterns.FactoryPattern;

public class Dog extends Animal
{
    @Override
    public String makeSound() {
        return "Woof";
    }

}
