package Prototype;

public class Square extends Shape {
    public Square() {
        this.type = "square";
        draw();
    }

    @Override
    void draw() {
        System.out.println("draw a square.");
    }
}
