package com.dorosli.test.CreationalDesignPatterns.SingletonPattern;

public class Demo
{
    public static void main(String[] args)
    {
        SingletonExample singletonExample = SingletonExample.getInstance();

        singletonExample.sayHello();
    }
}
