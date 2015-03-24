package observer_pattern_java_internal;

public class WeatherStation_java_internal {
    public static void start() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80f, 65, 30.4f);
        weatherData.setMeasurements(82f, 70, 29.2f);
    }

}
