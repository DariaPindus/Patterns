package com.daria.uni.patterns.factory.impl.passenger;


import com.daria.uni.patterns.factory.interfaces.Engine;

public class PassengerEngine implements Engine{
    private String name;
    private double power;

    public PassengerEngine(){
        name = "Passenger Engine V6";
        power = 120.0;
    }

    @Override
    public void CreateEngine() {
        name = "Passenger Engine V6";
        power = 120.0;
    }

    @Override
    public String toString() {
        return "Name: " + name + "; Power: " + power;
    }
}
