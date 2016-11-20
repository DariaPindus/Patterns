package com.daria.uni.patterns.factory.impl.bus;


import com.daria.uni.patterns.factory.interfaces.Body;

public class BusBody implements Body{
    String name;
    double[] size;

    public BusBody(){
        name = "Bus body. Bogdan";
        size = new double[]{4.2, 2.0, 1.85};
    }

    @Override
    public String toString() {
        return "Name: " + name + "; Sizes: " + size;
    }
}
