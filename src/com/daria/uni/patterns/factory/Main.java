package com.daria.uni.patterns.factory;


import com.daria.uni.patterns.factory.factories.BusFactory;
import com.daria.uni.patterns.factory.factories.PassengerCarFactory;
import com.daria.uni.patterns.factory.factories.TruckFactory;
import com.daria.uni.patterns.factory.interfaces.CarFactory;

public class Main {
    public static void main(String[] args) {
        CarFactory factory;
        String[] manufactureOrders = {"bus", "truck", "passenger"};
        //manufactureOrder = "bus";
        for (String s : manufactureOrders) {
            factory = null;
            switch (s) {
                case "bus":
                    factory = new BusFactory();
                    break;
                case "passenger":
                    factory = new PassengerCarFactory();
                    break;
                case "truck":
                    factory = new TruckFactory();
                    break;
            }
            System.out.println(factory);
        }
    }
}
