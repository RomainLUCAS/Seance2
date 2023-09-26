package org.example;

public class CableAdapter implements Chargeable{
    USBCSmartphone usbcSmartphone;

    public CableAdapter(USBCSmartphone smartphone){
        usbcSmartphone = smartphone;
    }

    @Override
    public void charger() {
        usbcSmartphone.chargeWithUSBCCable();
    }
}
