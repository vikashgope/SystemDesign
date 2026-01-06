package designpatterns.prototype;

public class Rectangle implements Shape {

    private double width,height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
    @Override
    public Shape clone() {
        return new Rectangle(this.width, this.height);
    }

}
