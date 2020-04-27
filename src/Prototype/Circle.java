package Prototype;

public class Circle extends Shape {
    public Circle() {
        this.type = "circle";
        draw();
    }

    @Override
    void draw() {
        System.out.println("draw a circle.");
    }
}
