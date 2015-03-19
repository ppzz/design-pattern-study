package strategy_pattern;

/**
 * Created by zp on 15-3-19.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying with a rocket");
    }
}
