package com.dorosli.test.CreationalDesignPatterns.AbstractFactoryPattern;

import com.dorosli.test.CreationalDesignPatterns.FactoryPattern.Animal;

public class Snake extends Animal
{

    @Override
    public String makeSound() {
        return "Hiss";
    }

}
