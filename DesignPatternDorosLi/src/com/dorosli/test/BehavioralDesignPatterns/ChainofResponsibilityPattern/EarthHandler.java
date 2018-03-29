package com.dorosli.test.BehavioralDesignPatterns.ChainofResponsibilityPattern;

public class EarthHandler extends PlanetHandler
{

    @Override
    public void handleRequest(PlanetEnum request)
    {
        if (request == PlanetEnum.EARTH)
        {
            System.out.println("EarthHandler handles " + request);
            System.out.println("Earth is comfortable.\n");
        }
        else
        {
            System.out.println("EarthHandler doesn't handle " + request);
            if (successor != null)
            {
                successor.handleRequest(request);
            }
        }
    }

}