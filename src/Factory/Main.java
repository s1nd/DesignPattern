package Factory;

public class Main {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.getShape("circular").draw();
        shapeFactory.getShape("square").draw();
        shapeFactory.getShape("rectangle").draw();
    }
}
