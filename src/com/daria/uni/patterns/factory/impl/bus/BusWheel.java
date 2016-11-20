package com.daria.uni.patterns.factory.impl.bus;


import com.daria.uni.patterns.factory.interfaces.Wheel;

public class BusWheel implements Wheel{
    private String name;
    private double diameter;

    public BusWheel(){
        name = "Bus wheel. God luck wheel";
        diameter = 35.7;
    }

    @Override
    public void CreateWheel() {
        name = "Bus wheel. God luck wheel";
        diameter = 35.7;
    }

    @Override
    public String toString() {
        return "Name: " + name + "; Diameter: " + diameter;
    }
}
