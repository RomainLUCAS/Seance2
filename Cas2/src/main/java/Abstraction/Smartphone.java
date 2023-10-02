package Abstraction;

import Implementation.Manufacturer;

public class Smartphone implements Phone{
    private final Manufacturer manufacturer;

    public Smartphone(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void makeCall() {
        System.out.println("Making a call from a " + manufacturer.getName() + " smartphone.");
    }

    @Override
    public void sendText() {
        System.out.println("Sending a text from a " + manufacturer.getName() + " smartphone.");
    }

    public void browseInternet() {
        System.out.println("Browsing the internet from a " + manufacturer.getName() + " smartphone.");
    }

    public void takePhoto() {
        System.out.println("Taking a photo with a " + manufacturer.getName() + " smartphone.");
    }
}
