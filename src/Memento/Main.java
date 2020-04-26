package Memento;

public class Main {
    public static void main(String[] args){
        Originator originator1 = new Originator();
        CareTack careTack1 = new CareTack();
        originator1.setStatus("status-1");
        careTack1.add(originator1.saveToMementos());
        originator1.setStatus("status-2");

        System.out.println(originator1.getStatus());

        originator1.getFromMementos(careTack1.get(0));
        System.out.println(originator1.getStatus());

    }
}
