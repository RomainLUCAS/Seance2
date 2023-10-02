package Implementation;

public class Samsung implements Manufacturer {
    @Override
    public String getName() {
        return "Samsung";
    }

    @Override
    public String producePhone() {
        return "Samsung Phone";
    }
}
