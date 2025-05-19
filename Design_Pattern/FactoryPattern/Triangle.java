public class Triangle implements Shape{

    private int a;
    private int b;
    private int c;

    public Triangle() {
        this.a = 3;
        this.b = 6;
        this.c = 1;
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea(){
        double s = (a+b+c)/2;
        return s*(s-a)*(s-b)*(s-c);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}
