import observer_pattern.WeatherStation;
import observer_pattern_java_internal.WeatherStation_java_internal;
import strategy_pattern.MiniDuckSimulator;

public class Entry {
    public static void main(String[] args) {
        //策略模式
        System.out.println("\nstrategy-pattern------------------------------------");
        MiniDuckSimulator.start();
        System.out.println("\nobserver-pattern------------------------------------");
        //观察者模式:
        WeatherStation.start();
        System.out.println("\nobserver-pattern-java-internal----------------------");
        //观察者模式:
        WeatherStation_java_internal.start();
    }
}
