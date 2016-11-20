package com.daria.uni.patterns.factory.factories;


import com.daria.uni.patterns.factory.impl.truck.TruckBody;
import com.daria.uni.patterns.factory.impl.truck.TruckEngine;
import com.daria.uni.patterns.factory.impl.truck.TruckWheel;
import com.daria.uni.patterns.factory.interfaces.Body;
import com.daria.uni.patterns.factory.interfaces.CarFactory;
import com.daria.uni.patterns.factory.interfaces.Engine;
import com.daria.uni.patterns.factory.interfaces.Wheel;

public class TruckFactory implements CarFactory{
    private Body body;
    private Engine engine;
    private Wheel[] wheels;

    public TruckFactory() {
        createBody();
        createEngine();
        createWheel();
    }

    @Override
    public void createBody() {
        body = new TruckBody();
    }

    @Override
    public void createEngine() {
        engine = new TruckEngine();
    }

    @Override
    public void createWheel() {
        wheels = new Wheel[6];
        for (int i = 0; i < wheels.length; i++)
            wheels[i] = new TruckWheel();
    }


    @Override
    public String toString() {
        return "Truck was created. \t Body: " + body + "; Engine : " + engine + "; Wheels " + wheels[0];
    }
}
