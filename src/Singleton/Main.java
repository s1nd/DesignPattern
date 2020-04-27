package Singleton;

public class Main {
    public static void main(String[] args){
        //饿汉式
        SingleObject instance = SingleObject.getInstance();
        instance.showMassage();

        //懒汉式
        LazyDog ld = LazyDog.getLazyDog();
        ld.showMessage();

        //双验锁
        DCL dcl =DCL.getInstance();
        dcl.showMessage();
    }
}
