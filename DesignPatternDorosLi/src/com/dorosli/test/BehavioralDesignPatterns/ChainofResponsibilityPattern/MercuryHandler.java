package com.dorosli.test.BehavioralDesignPatterns.ChainofResponsibilityPattern;

public class MercuryHandler extends PlanetHandler
{

    @Override
    public void handleRequest(PlanetEnum request)
    {
        if (request == PlanetEnum.MERCURY)
        {
            System.out.println("MercuryHandler handles " + request);
            System.out.println("Mercury is hot.\n");
        }
        else
        {
            System.out.println("MercuryHandler doesn't handle " + request);
            if (successor != null)
            {
                successor.handleRequest(request);
            }
        }
    }

}