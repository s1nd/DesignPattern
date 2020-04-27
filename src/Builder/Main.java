package Builder;

public class Main {
    public static void main(String[] args){
        Meal m = new Meal();
        VegBurger vegBurger = new VegBurger();
        Juice juice = new Juice();
        m.add(vegBurger);
        m.add(juice);
        m.showItems();
        System.out.println("total cost:"+m.getCost());
    }
}
