package behavioural.observer;

public interface WeatherObserver {
    void update(float temperature, float humidity, float pressure) throws Exception;
}
