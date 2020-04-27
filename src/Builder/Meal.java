package Builder;

import java.util.ArrayList;

public class Meal {
    private java.util.List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public float getCost() {
        float price = 0.0f;
        for(Item item:items){
            price += item.price();
        }
        return price;
    }

    public void showItems() {
        for (Item i:items){
            System.out.println("item:"+i.name());
            System.out.println("packing:"+i.packing().pack());
            System.out.println("price:"+i.price()+"\n");

        }
    }
}
