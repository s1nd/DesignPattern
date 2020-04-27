package Prototype;

import java.util.HashMap;

public class ShapeCache {
    private static java.util.HashMap<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeId) throws CloneNotSupportedException {
        Shape s = shapeMap.get(shapeId);
        return (Shape)s.clone();
    }

    public static void loadCache() {
        System.out.println("load...");
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(),rectangle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(),square);
        System.out.println("finished...");
    }
}
