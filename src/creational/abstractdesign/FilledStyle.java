package creational.abstractdesign;

class FilledStyle implements Style {
    @Override
    public void applyStyle() {
        System.out.println("Applying filled style");
    }
}