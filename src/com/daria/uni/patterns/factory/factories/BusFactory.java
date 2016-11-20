package com.daria.uni.patterns.factory.factories;


import com.daria.uni.patterns.factory.impl.bus.BusBody;
import com.daria.uni.patterns.factory.impl.bus.BusEngine;
import com.daria.uni.patterns.factory.impl.bus.BusWheel;
import com.daria.uni.patterns.factory.interfaces.Body;
import com.daria.uni.patterns.factory.interfaces.CarFactory;
import com.daria.uni.patterns.factory.interfaces.Engine;
import com.daria.uni.patterns.factory.interfaces.Wheel;

public class BusFactory implements CarFactory {
    Body body;
    Engine engine;
    Wheel[] wheels;

    public BusFactory() {
        createBody();
        createEngine();
        createWheel();
    }

    @Override
    public void createBody() {
        body = new BusBody();
    }

    @Override
    public void createEngine() {
        engine = new BusEngine();
    }

    @Override
    public void createWheel() {
        wheels = new Wheel[6];
        for (int i = 0; i < wheels.length; i++)
            wheels[i] = new BusWheel();
    }

    @Override
    public String toString() {
        return "Bus was created. \t Body: " + body + "; Engine : " + engine + "; Wheels " + wheels[0];
    }
}
