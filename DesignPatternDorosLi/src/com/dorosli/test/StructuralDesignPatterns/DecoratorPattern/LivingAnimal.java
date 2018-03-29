package com.dorosli.test.StructuralDesignPatterns.DecoratorPattern;

public class LivingAnimal implements Animal
{

    @Override
    public void describe()
    {
        System.out.println("\nI am an animal.");
    }
}
