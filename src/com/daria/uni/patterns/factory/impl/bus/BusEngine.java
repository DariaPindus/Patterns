package com.daria.uni.patterns.factory.impl.bus;


import com.daria.uni.patterns.factory.interfaces.Engine;

public class BusEngine implements Engine {

    private String name;
    private double power;

    public BusEngine(){
        name = "Bus Engine II192";
        power = 175.0;
    }


    @Override
    public String toString() {
        return "Name: " + name + "; Power: " + power;
    }
}
