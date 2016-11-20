package com.daria.uni.patterns.factory.impl.truck;


import com.daria.uni.patterns.factory.interfaces.Body;

public class TruckBody implements Body{
    String name;
    double[] size;

    public TruckBody(){
        name = "Truck body. Mercedez";
        size = new double[]{4.5, 2.5, 1.85};
    }

    @Override
    public void CreateBody() {
        name = "Truck body. Mercedez";
        size = new double[]{4.5, 2.5, 1.85};

    }

    @Override
    public String toString() {
        return "Name: " + name + "; Sizes: " + size;
    }
}
