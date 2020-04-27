package AbstractFactory;

public class Main {
    public  static void main(String[] args){
//        FactoryProducer factoryProducer = new FactoryProducer();
        //error
//        ShapeFactory s = (ShapeFactory) FactoryProducer.getFactory("color");
        AbstractFactory s =  FactoryProducer.getFactory("shape");
        AbstractFactory c =  FactoryProducer.getFactory("color");
        s.getShape("circular").draw();

        c.getColor("red").fill();
    }
}
