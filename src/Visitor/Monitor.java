package Visitor;

public class Monitor implements ComputerPart {
    @Override
    public void Accept(ComputerPartVisitor cpv) {
        cpv.visit(this);
    }
}
