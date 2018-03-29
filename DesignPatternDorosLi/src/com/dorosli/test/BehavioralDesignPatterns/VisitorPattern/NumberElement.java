package com.dorosli.test.BehavioralDesignPatterns.VisitorPattern;

public interface NumberElement
{
    public void accept(NumberVisitor visitor);
}
