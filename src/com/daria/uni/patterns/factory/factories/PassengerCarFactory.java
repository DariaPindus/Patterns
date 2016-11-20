package com.daria.uni.patterns.factory.factories;


import com.daria.uni.patterns.factory.impl.passenger.PassengerBody;
import com.daria.uni.patterns.factory.impl.passenger.PassengerEngine;
import com.daria.uni.patterns.factory.impl.passenger.PassengerWheel;
import com.daria.uni.patterns.factory.interfaces.Body;
import com.daria.uni.patterns.factory.interfaces.CarFactory;
import com.daria.uni.patterns.factory.interfaces.Engine;
import com.daria.uni.patterns.factory.interfaces.Wheel;

public class PassengerCarFactory implements CarFactory {
    Body body;
    Engine engine;
    Wheel[] wheels;

    public PassengerCarFactory() {
        createBody();
        createEngine();
        createWheel();
    }

    @Override
    public void createBody() {
        body = new PassengerBody();
    }

    @Override
    public void createEngine() {
        engine = new PassengerEngine();
    }

    @Override
    public void createWheel() {
        wheels = new Wheel[6];
        for (int i = 0; i < wheels.length; i++)
            wheels[i] = new PassengerWheel();
    }


    @Override
    public String toString() {
        return "Passenger was created. \t Body: " + body + "; Engine : " + engine + "; Wheels " + wheels[0];
    }
}
