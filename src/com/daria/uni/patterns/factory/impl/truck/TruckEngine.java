package com.daria.uni.patterns.factory.impl.truck;


import com.daria.uni.patterns.factory.interfaces.Engine;

public class TruckEngine implements Engine{

    private String name;
    private double power;

    public TruckEngine(){
        name = "Truck Engine SuperPower666";
        power = 288.0;
    }

    @Override
    public void CreateEngine() {
        name = "Truck Engine SuperPower666";
        power = 288.0;
    }

    @Override
    public String toString() {
        return "Name: " + name + "; Power: " + power;
    }
}
