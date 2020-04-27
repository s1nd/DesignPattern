package Factory;

public class ShapeFactory {
    public Shape getShape(String type) {
        if(type == null){
            return null;
        }else if(type.equalsIgnoreCase("circular")){
            return new CircularShape();
        }else if(type.equalsIgnoreCase("square")){
            return new SquareShape();
        }else if(type.equalsIgnoreCase("rectangle")){
            return new RectangleShape();
        }
        return null;
    }

}
