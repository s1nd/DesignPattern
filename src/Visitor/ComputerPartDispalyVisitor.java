package Visitor;

public class ComputerPartDispalyVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("computer visited");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("mouse visited");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("monitor visited");
    }
}
