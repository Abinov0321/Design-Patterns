package creational.factory;

public class VehicleFactory {
    public Vehicle getVehicle(String vehicleType) throws Exception {
        if (vehicleType == null) {
            throw new Exception("Vehicle type cannot be null");
        }
        if (vehicleType.equalsIgnoreCase("CAR")) {
            return new Car();
        } else if (vehicleType.equalsIgnoreCase("BIKE")) {
            return new Bike();
        }
        throw new Exception("Invalid vehicle type: " + vehicleType);
    }
}
