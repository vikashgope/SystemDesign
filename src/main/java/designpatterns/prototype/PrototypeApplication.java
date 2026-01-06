package designpatterns.prototype;


public class PrototypeApplication {
    public static void main(String[] args) {

        Shape circlePrototype = new Circle(5);
        ShapeClient client = new ShapeClient(circlePrototype);
        Shape circle = client.createShape();
        circle.draw();
    }
}
