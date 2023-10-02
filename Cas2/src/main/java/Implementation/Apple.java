package Implementation;

public class Apple implements Manufacturer {
    @Override
    public String getName() {
        return "Apple";
    }

    @Override
    public String producePhone() {
        return "Apple Phone";
    }
}
