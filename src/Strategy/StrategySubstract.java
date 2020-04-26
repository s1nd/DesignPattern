package Strategy;

public class StrategySubstract implements Strategy {
    @Override
    public int doOperation(int x, int y) {
        return x-y;
    }
}
