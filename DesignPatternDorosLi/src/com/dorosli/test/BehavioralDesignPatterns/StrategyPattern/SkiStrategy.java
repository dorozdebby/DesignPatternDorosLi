package com.dorosli.test.BehavioralDesignPatterns.StrategyPattern;

public class SkiStrategy implements Strategy
{

    @Override
    public boolean checkTemperature(int temperatureInF)
    {
        if (temperatureInF <= 32)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
