package creational.abstractdesign;

class OutlinedRectangle extends Rectangle {
    @Override
    public void draw() {
        super.draw();
        new OutlinedStyle().applyStyle();
    }
}
