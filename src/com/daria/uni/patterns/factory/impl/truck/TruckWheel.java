package com.daria.uni.patterns.factory.impl.truck;

import com.daria.uni.patterns.factory.interfaces.Wheel;


public class TruckWheel implements Wheel {
    private String name;
    private double diameter;

    public  TruckWheel(){
        name = "Truck wheel. Michelene truck";
        diameter = 45.0;
    }

    @Override
    public void CreateWheel() {
        name = "Truck wheel. Michelene truck";
        diameter = 45.0;
    }

    @Override
    public String toString() {
        return "Name: " + name + "; Diameter: " + diameter;
    }
}
