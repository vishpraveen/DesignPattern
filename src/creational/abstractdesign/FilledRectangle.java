package creational.abstractdesign;

class FilledRectangle extends Rectangle {
    @Override
    public void draw() {
        super.draw();
        new FilledStyle().applyStyle();
    }
}