package Bridge;

public class Main {
    public static void main(String[] args){
        new Circular(new RedCircular(),1,2,3).draw();
        new Circular(new GreenCircluar(),1,2,3).draw();
    }
}
