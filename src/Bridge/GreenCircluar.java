package Bridge;

public class GreenCircluar implements DrawAPI {
    @Override
    public void DrawCircular(int radius, int x, int y) {
            System.out.println("a green circular of radius "+radius+" was draw[position:("+x+","+y+")]");
    }
}
