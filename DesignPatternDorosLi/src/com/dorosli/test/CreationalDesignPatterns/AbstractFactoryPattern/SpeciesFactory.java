package com.dorosli.test.CreationalDesignPatterns.AbstractFactoryPattern;

import com.dorosli.test.CreationalDesignPatterns.FactoryPattern.Animal;

public abstract class SpeciesFactory
{
    public abstract Animal getAnimal(String type);
}
