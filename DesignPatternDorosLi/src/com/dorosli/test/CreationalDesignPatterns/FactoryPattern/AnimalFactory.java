package com.dorosli.test.CreationalDesignPatterns.FactoryPattern;

public class AnimalFactory
{
    public Animal getAnimal(String type)
    {
        if ("canine".equals(type))
        {
            return new Dog();
        }
        else
        {
            return new Cat();
        }
    }
}
