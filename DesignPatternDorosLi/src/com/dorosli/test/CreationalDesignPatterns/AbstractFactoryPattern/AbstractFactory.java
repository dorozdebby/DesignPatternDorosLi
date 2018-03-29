package com.dorosli.test.CreationalDesignPatterns.AbstractFactoryPattern;

public class AbstractFactory
{
    public SpeciesFactory getSpeciesFactory(String type) {
        if ("mammal".equals(type)) {
            return new MammalFactory();
        } else {
            return new ReptileFactory();
        }
    }
}
