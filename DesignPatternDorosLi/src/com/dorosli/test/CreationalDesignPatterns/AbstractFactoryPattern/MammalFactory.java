package com.dorosli.test.CreationalDesignPatterns.AbstractFactoryPattern;

import com.dorosli.test.CreationalDesignPatterns.FactoryPattern.Animal;
import com.dorosli.test.CreationalDesignPatterns.FactoryPattern.Cat;
import com.dorosli.test.CreationalDesignPatterns.FactoryPattern.Dog;

public class MammalFactory extends SpeciesFactory
{

    @Override
    public Animal getAnimal(String type)
    {
        if ("dog".equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }

}
