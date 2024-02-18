package creational.factory;
/**
 * The Factory Design Pattern is a creational pattern that provides an interface for
 * creating objects without specifying their concrete classes.
 * It defines a method for creating objects within a superclass,
 * allowing subclasses to alter the type of objects that will be created.
 * This pattern promotes loose coupling by separating the client code from the actual
 * implementation of the objects being created.
 * <p>
 * Here's a simplified explanation of the Factory Design Pattern along with a sample code example:
 * <p>
 * Let's consider a scenario where you have a Vehicle interface, and you want to create different types of vehicles
 * such as Car, Truck, and Motorcycle. Instead of instantiating these objects directly in the client code,
 * you can use a factory to create instances based on some criteria.
 * */

public class ManufactureVehicle {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.createVehicle("car");
        car.manufacture();

        Vehicle truck = VehicleFactory.createVehicle("truck");
        truck.manufacture();

        Vehicle motorcycle = VehicleFactory.createVehicle("motorcycle");
        motorcycle.manufacture();
    }
}
