package creational.factory;

public class Car implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing a Car.");
    }
}
