package AbstractFactory;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }else if(color.equalsIgnoreCase("red")){
            return  new Red();
        }else if(color.equalsIgnoreCase("black")){
            return new black();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
