package Visitor;

public class Mouse implements ComputerPart {
    @Override
    public void Accept(ComputerPartVisitor cpv) {
        cpv.visit(this);
    }
}
