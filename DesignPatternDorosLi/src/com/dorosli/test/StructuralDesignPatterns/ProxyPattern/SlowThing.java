package com.dorosli.test.StructuralDesignPatterns.ProxyPattern;

public class SlowThing extends Thing
{
    public SlowThing()
    {
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
