package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Chargeable simplePhone=new SimplePhone();
        StandardCharger standardCharger=new StandardCharger(simplePhone);
        standardCharger.connectPhone();

        USBCSmartphone usbCSmartphone= new USBCSmartphone();
        standardCharger=new StandardCharger(new CableAdapter(usbCSmartphone));
        standardCharger.connectPhone();
    }
}
