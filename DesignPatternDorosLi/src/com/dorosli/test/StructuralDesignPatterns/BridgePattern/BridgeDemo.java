package com.dorosli.test.StructuralDesignPatterns.BridgePattern;

public class BridgeDemo
{
    public static void main(String[] args)
    {

        Vehicle vehicle = new BigBus(new SmallEngine());
        vehicle.drive();
        vehicle.setEngine(new BigEngine());
        vehicle.drive();

        vehicle = new SmallCar(new SmallEngine());
        vehicle.drive();
        vehicle.setEngine(new BigEngine());
        vehicle.drive();

    }

}
