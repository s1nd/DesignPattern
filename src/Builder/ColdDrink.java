package Builder;

public abstract class ColdDrink implements Item {
    @Override
    public String name() {
        return null;
    }

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
