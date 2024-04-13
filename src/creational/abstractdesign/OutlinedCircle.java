package creational.abstractdesign;

class OutlinedCircle extends Circle {
    @Override
    public void draw() {
        super.draw();
        new OutlinedStyle().applyStyle();
    }
}