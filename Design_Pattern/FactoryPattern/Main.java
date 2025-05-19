public class Main {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();
        Shape shape1 = sf.getShape("triangle");
        Shape shape2 = sf.getShape("rectangle");
        Shape shape3 = sf.getShape("circle");

        shape1.draw();
        shape2.draw();
        shape3.draw();

    }
}
