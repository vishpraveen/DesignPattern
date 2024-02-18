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
 * <p>
 * In this example:
 * <p>
 * 1. We define a Vehicle interface with a manufacture() method.
 * 2. We create concrete implementations of the Vehicle interface: Car, Truck, and Motorcycle.
 * 3. We create a VehicleFactory class with a static method createVehicle() that takes a String
 *  representing the type of vehicle to create. Based on the input, it returns an instance of the
 *  corresponding concrete class.
 * 4. In the client code, we use the VehicleFactory to create instances of vehicles without having
 *  to know their concrete classes. We only specify the type of vehicle we want to create.
 * <p>
 * This way, if we need to add more types of vehicles in the future, we can simply modify the
 * VehicleFactory class without changing the client code, adhering to the open/closed principle
 * of software design.
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
