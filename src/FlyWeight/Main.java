package FlyWeight;

public class Main {
    public final static String colors[] = {"green","black","white","red","blue"};
    public static void main(String[] args){
        for(int i=0;i<20;i++){
            Circle c = ShapeFactory.getCircle(randomColor());
            c.setX(randomX());
            c.setY(randomY());
            c.setRadius(100);
            c.draw();
        }
    }
    public static String randomColor(){
        return colors[(int)(Math.random()*colors.length)];
    }

    public static int randomX(){
        return (int)(Math.random()*100);
    }
    public static int randomY(){
        return (int)(Math.random()*100);
    }
}
