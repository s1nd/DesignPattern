package Bridge;

public class Circular extends Shape {
    private int x = 0;
    private int y = 0;
    private int radius = 0;

    public Circular(Bridge.DrawAPI drawAPI, int radius, int x, int y) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }


    @Override
    void draw() {
        DrawAPI.DrawCircular(radius,x,y);
    }
}
