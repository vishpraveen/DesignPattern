package creational.abstractdesign;

public class FilledShapeFactory implements ShapeFactory{

    @Override
    public Shape createShape() {
        return new FilledCircle();
    }
}
