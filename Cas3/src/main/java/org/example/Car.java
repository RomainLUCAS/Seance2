package org.example;

import org.example.caroptions.CarOption;

import java.util.ArrayList;
import java.util.List;

public class Car {
    public List<CarOption> options;

    public Car(){
        options = new ArrayList<CarOption>();
    }

    public void AddOption(CarOption option){
        options.add(option);
    }
}
