package Visitor;

public class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer() {
       parts = new ComputerPart[]{new Mouse(), new Monitor()};
    }

    @Override
    public void Accept(ComputerPartVisitor cpv) {
        for(int i=0;i<parts.length;i++){
//            cpv.visit(parts[i]);
            parts[i].Accept(cpv);
        }
        cpv.visit(this);
    }
}
