package com.daria.uni.patterns.factory.impl.passenger;

import com.daria.uni.patterns.factory.interfaces.Wheel;


public class PassengerWheel implements Wheel {
    private String name;
    private double diameter;

    public PassengerWheel(){
        name = "Passenger wheel. BMW Sport wheel";
        diameter = 22.5;
    }


    @Override
    public String toString() {
        return "Name: " + name + "; Diameter: " + diameter;
    }
}
