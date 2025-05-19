public class Rectangle implements Shape{
    private int height;
    private int width;

    public Rectangle() {
        this.height = 2;
        this.width = 3;
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getArea(){
        return width*height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
