public class Circle implements Shape {
    private double pi = 3.141529;
    private double radius;

    public Circle() {
        this.radius = 5;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * pi;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
