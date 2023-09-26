package org.example;
public class StandardCharger implements Charger{
    Chargeable phone;
    public StandardCharger(Chargeable phone) {
        this.phone = phone;
    }

    public void connectPhone() {
        phone.charger();
    }
}
