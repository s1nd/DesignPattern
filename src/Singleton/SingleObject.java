package Singleton;

//饿汉式
public class SingleObject {
    private static SingleObject instance = new SingleObject();
    private SingleObject(){};
    public static SingleObject getInstance(){
        return instance;
    }
    void showMassage(){
        System.out.println("congratulations, get a instance!");
    }
}
