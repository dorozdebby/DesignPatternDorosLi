package com.dorosli.test.StructuralDesignPatterns.AdapterPattern;

public interface TemperatureInfo
{
    public double getTemperatureInF();

    public void setTemperatureInF(double temperatureInF);

    public double getTemperatureInC();

    public void setTemperatureInC(double temperatureInC);
}
