package creational.abstractdesign;

class OutlinedShapeFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        // Return an outlined shape
        return new OutlinedRectangle();
    }
}