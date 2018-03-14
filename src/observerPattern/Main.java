package observerPattern;

public class Main {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay ccd1 = new CurrentConditionDisplay(weatherData);
        CurrentConditionDisplay ccd2 = new CurrentConditionDisplay(weatherData);
        StatisticDisplay sc1 = new StatisticDisplay(weatherData);
        weatherData.setMeasurements(105, 98, 101);
        ccd1.quit();
        weatherData.setMeasurements(99, 100, 110);
        weatherData.setMeasurements(99, 100, 110);
        sc1.quit();
        weatherData.setMeasurements(99, 100, 110);
        weatherData.setMeasurements(99, 100, 110);

    }
}
