package Visitor;

public class Main {
    public static void main(String[] args){
        Computer c = new Computer();
        ComputerPartDispalyVisitor cpdv = new ComputerPartDispalyVisitor();
        c.Accept(cpdv);
    }
}
