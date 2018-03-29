package com.dorosli.test.CreationalDesignPatterns.AbstractFactoryPattern;

import com.dorosli.test.CreationalDesignPatterns.FactoryPattern.Animal;

public class ReptileFactory extends SpeciesFactory
{

    @Override
    public Animal getAnimal(String type)
    {
        if ("snake".equals(type)) {
            return new Snake();
        } else {
            return new Tyrannosaurus();
        }
    }

}
