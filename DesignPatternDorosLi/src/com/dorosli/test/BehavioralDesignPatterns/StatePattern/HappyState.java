package com.dorosli.test.BehavioralDesignPatterns.StatePattern;

public class HappyState implements EmotionalState
{
    @Override
    public String sayGoodbye()
    {
        return "Bye, friend!";
    }

    @Override
    public String sayHello()
    {
        return "Hello, friend!";
    }
}
