package creational.abstractdesign;
/**
 * The Abstract Factory Design Pattern is a creational pattern that provides an interface for creating families of
 * related or dependent objects without specifying their concrete classes. It allows clients to create objects without
 * knowing their specific implementations, promoting loose coupling between the client code and the actual implementations.
 *<p>
 * Here's an explanation of the Abstract Factory Design Pattern along with a code example:
 *<p>
 * Consider a scenario where you need to create different types of shapes (e.g., circles and rectangles) in different
 * styles (e.g., filled and outlined). Instead of instantiating these objects directly in the client code, you can use
 * abstract factories to create instances of shape objects and style them accordingly.
 * <p>
 * */
public class ManufactureShape {
    public static void main(String[] args) {
        ShapeFactory filledShapeFactory = new FilledShapeFactory();
        Shape circle = filledShapeFactory.createShape();
        circle.draw(); // Output: Drawing a circle \n Applying filled style

        ShapeFactory outlinedShapeFactory = new OutlinedShapeFactory();
        Shape rectangle = outlinedShapeFactory.createShape();
        rectangle.draw(); // Output: Drawing a rectangle \n Applying outlined style
    }
}
