package Builder;

public class BlackTea extends ColdDrink {
    @Override
    public String name() {
        return "BlackTea";
    }

    @Override
    public float price() {
        return 4.0f;
    }
}
