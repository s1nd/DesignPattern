package Singleton;

public class DCL {
    private static DCL instance;
    private DCL(){};
    public static DCL getInstance(){
        synchronized (DCL.class){
            if(instance == null){
                instance = new DCL();
            }
            return instance;
        }
    }
    public void showMessage(){
        System.out.println("get instance");
    }
}
