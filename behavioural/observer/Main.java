package behavioural.observer;

public class Main {
    public static void main(String[] args) {
        try {
            WeatherStation weatherStation = new WeatherStation();
            WeatherDisplay display = new WeatherDisplay();

            weatherStation.addObserver(display);
            weatherStation.setMeasurements(25.5f, 65.0f, 101325.0f);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}