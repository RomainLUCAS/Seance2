package org.example;

import org.example.caroptions.*;

public class FamilyCarBuilder implements CarBuilder{
    @Override
    public Car buildACar() {
        Car car = new Car();
        car.AddOption(new Body());
        car.AddOption(new Doors());
        car.AddOption(new Whells());
        car.AddOption(new Motors());
        car.AddOption(new ChildSeat());
        return car;
    }
}
