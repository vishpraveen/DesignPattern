package creational.factory;

public class VehicleFactory {
    public static Vehicle createVehicle(String type) {
        return switch (type) {
            case "car" -> new Car();
            case "truck" -> new Truck();
            case "motorcycle" -> new Motorcycle();
            default -> throw new IllegalArgumentException("Invalid vehicle type: " + type);
        };
    }
}
