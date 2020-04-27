package Bridge;

public abstract class Shape {
    protected DrawAPI DrawAPI;
    public Shape(Bridge.DrawAPI drawAPI) {
        DrawAPI = drawAPI;
    }
    abstract void draw();
}
