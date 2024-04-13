package creational.abstractdesign;

class FilledCircle extends Circle {
    @Override
    public void draw() {
        super.draw();
        new FilledStyle().applyStyle();
    }
}