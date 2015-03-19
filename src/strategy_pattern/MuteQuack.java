package strategy_pattern;

/**
 * Created by zp on 15-3-19.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<silence>>");
    }
}
