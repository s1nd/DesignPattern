package Bridge;

public class RedCircular implements DrawAPI {
    @Override
    public void DrawCircular(int radius, int x, int y) {
        System.out.println("a red circular of radius "+radius+" was draw[position:("+x+","+y+")]");
    }
}
