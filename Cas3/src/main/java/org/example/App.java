package org.example;

import org.example.caroptions.CarOption;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CarBuilder carBuilder;
        Car car;
        System.out.println( "\nConstructeur de voiture familiale :" );
        carBuilder = new FamilyCarBuilder();
        car = carBuilder.buildACar();
        for(CarOption option : car.options){
            System.out.println(option.description());
        }

        System.out.println( "\nConstructeur de voiture sportive :" );
        carBuilder = new SportCarBuilder();
        car = carBuilder.buildACar();
        for(CarOption option : car.options){
            System.out.println(option.description());
        }
    }
}
