package FlyWeight;

public class Circle implements Shape {
    private int radius = 0;
    private int x = 0;
    private int y = 0;
    private String color;


    @Override
    public void draw() {
        System.out.println("draw a " + color + " circle:(" + x +"," + y + ")");
    }

    //需要new circle(color),后面还要设置radius，x，y
//    public Circle(int radius,int x,int y) {
//        this.radius = radius;
//        this.x = x;
//        this.y = y;
//    }
    public Circle(String color) {
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


}
