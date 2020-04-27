package Builder;

public abstract class Burger implements Item {
//    @Override
//    public String name() {
//        return null;
//    }

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
