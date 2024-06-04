package behavioural.observer;

public class WeatherDisplay implements WeatherObserver {
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) throws Exception {
        if (temperature < -273.15 || humidity < 0 || humidity > 100 || pressure < 0) {
            throw new Exception("Invalid weather data");
        }
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "C degrees, " + humidity + "% humidity, " + pressure + "Pa pressure");
    }
}