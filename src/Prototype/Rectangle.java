package Prototype;

public class Rectangle extends Shape {
    public Rectangle() {
        this.type = "rectangle";
        draw();
    }

    @Override
    void draw() {
        System.out.println("draw a rectangle.");
    }
}
