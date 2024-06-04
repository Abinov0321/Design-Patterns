package creational.factory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        try {
            Vehicle vehicle1 = factory.getVehicle("CAR");
            vehicle1.drive();

            Vehicle vehicle2 = factory.getVehicle("BIKE");
            vehicle2.drive();

            // This will throw an error
            Vehicle vehicle3 = factory.getVehicle("PLANE");
            vehicle3.drive();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}