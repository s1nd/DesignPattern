package Builder;

public class Juice extends ColdDrink {

    @Override
    public String name() {
        return "sweet juice";
    }

    @Override
    public float price() {
        return 3.00f;
    }
}
