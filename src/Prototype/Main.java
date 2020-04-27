package Prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //为什么加类型转换，
        ShapeCache.loadCache();
        Shape c = (Shape) ShapeCache.getShape("1");
        System.out.println("shape1:"+c.type);

        Shape r = ShapeCache.getShape("2");
        System.out.println("shape2:"+r.type);

        Shape s = ShapeCache.getShape("3");
        System.out.println("shape3:"+s.type);

    }
}
