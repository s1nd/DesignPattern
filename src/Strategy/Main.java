package Strategy;

public class Main {
    public static void main(String[] args){
        Context context1 = new Context(new StrategyAdd());
        System.out.println(context1.executeOperation(1,2));

        Context context2 = new Context(new StrategySubstract());
        System.out.println(context2.executeOperation(1,2));

        Context context3 = new Context(new StrategyMultiply());
        System.out.println(context3.executeOperation(1,2));
    }

}
