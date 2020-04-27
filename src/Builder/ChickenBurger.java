package Builder;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "delicious chickenBurger";
    }

    @Override
    public float price() {
        return 10.0f;
    }

}
