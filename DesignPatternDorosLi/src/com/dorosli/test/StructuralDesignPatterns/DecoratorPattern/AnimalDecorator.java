package com.dorosli.test.StructuralDesignPatterns.DecoratorPattern;

public abstract class AnimalDecorator implements Animal
{
    Animal animal;

    public AnimalDecorator(Animal animal)
    {
        this.animal = animal;
    }

}
