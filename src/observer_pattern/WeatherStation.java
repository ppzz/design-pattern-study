package observer_pattern;

public class WeatherStation {
    public static void start() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80f, 65, 30.4f);
        weatherData.setMeasurements(82f, 70, 29.2f);
    }

}
