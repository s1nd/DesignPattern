package FlyWeight;

import java.util.HashMap;

public class ShapeFactory {
    private static final java.util.HashMap<String, Shape> circleMap = new HashMap<>();

    public static Circle getCircle(String color) {
        Circle cir = (Circle) circleMap.get(color);
        if(cir == null){
            cir = new Circle(color);
            circleMap.put(color,cir);
        }
        return cir;
    }
}
