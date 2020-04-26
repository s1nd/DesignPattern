package Strategy;

public class Context {
    Strategy strategy;
    public Context(Strategy stg) {
        strategy = stg;
    }

    public int executeOperation(int a, int b) {
        return strategy.doOperation(a, b);
    }
}
