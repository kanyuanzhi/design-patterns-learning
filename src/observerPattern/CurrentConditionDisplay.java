package observerPattern;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humility;
    private Subject subject;

    public CurrentConditionDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humility = humidity;
        display();
    }

    @Override
    public void quit() {
        this.subject.removeObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + this.temperature + "F degrees and " + this.humility + "% humidity");
    }
}
