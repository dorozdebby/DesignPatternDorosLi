package com.dorosli.test.BehavioralDesignPatterns.MediatorPattern;

public class SwedishBuyer extends Buyer
{
    public SwedishBuyer(Mediator mediator) {
        super(mediator, "krona");
        this.mediator.registerSwedishBuyer(this);
    }
}
