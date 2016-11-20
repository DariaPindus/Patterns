package com.daria.uni.patterns.factory.impl.passenger;

import com.daria.uni.patterns.factory.interfaces.Body;


public class PassengerBody implements Body {
    String name;
    double[] size;

    public PassengerBody(){
        name = "Passenger body. Cabriolet Audi";
        size = new double[]{2.5, 2.0, 1.6};
    }

    @Override
    public String toString() {
        return "Name: " + name + "; Sizes: " + size;
    }
}
