package observerPattern;

public interface Observer {
    void update(float temp, float humidity, float pressure);
    void quit();
}
