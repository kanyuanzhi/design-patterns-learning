package observerPattern;

import java.util.ArrayList;

public class StatisticDisplay implements Observer, DisplayElement {
    private ArrayList<Float> temperatures;
    private float averageTemperature;
    private Subject subject;

    public StatisticDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
        this.temperatures = new ArrayList<Float>();
        this.averageTemperature = 0f;
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperatures.add(temp);
        this.averageTemperature = (this.averageTemperature * (this.temperatures.size() - 1) + temp) / this.temperatures.size();
        if (this.temperatures.size() > 10) {
            Object t0 = this.temperatures.remove(0);
            this.averageTemperature = (this.averageTemperature * 11 - (Float)t0) / 10;
        }
        this.display();
    }

    @Override
    public void quit() {
        this.subject.removeObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Now average temperature is:" + this.averageTemperature + "F degrees.");
    }
}


