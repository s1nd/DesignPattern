package AbstractFactory;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if(shape == null){
            return new Circular();
        }else if(shape.equalsIgnoreCase("circular")){
            return new Square();
        }else if(shape.equalsIgnoreCase("square")){
            return new Square();
        }
        return null;
    }
}
