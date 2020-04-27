package Singleton;

//懒汉式，线程不安全
public class LazyDog {
    private static LazyDog instance ;
    private LazyDog(){};
    public static LazyDog getLazyDog(){
        if(instance == null){
            instance = new LazyDog();
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("get instance instance");
    }
}
