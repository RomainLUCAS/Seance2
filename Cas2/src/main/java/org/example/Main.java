package org.example;

import Abstraction.Phone;
import Abstraction.Smartphone;
import Implementation.Manufacturer;
import Implementation.Samsung;
import Implementation.Apple;

public class Main {
    public static void main(String[] args) {

        //We crate the phones from the different manufacturers
        Manufacturer samsung = new Samsung();
        Manufacturer apple = new Apple();

        Phone samsungPhone = new Smartphone(samsung);
        Smartphone iphone = new Smartphone(apple);

        //We use them
        samsungPhone.makeCall();
        samsungPhone.sendText();

        iphone.makeCall();
        iphone.sendText();
        iphone.browseInternet();
        iphone.takePhoto();

    }
}