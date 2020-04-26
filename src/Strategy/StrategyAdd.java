package Strategy;

public class StrategyAdd implements Strategy {
    @Override
    public int doOperation(int x, int y) {
        return x+y;
    }
}
