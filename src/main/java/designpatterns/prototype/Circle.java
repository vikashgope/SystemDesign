package designpatterns.prototype;

import org.springframework.boot.logging.log4j2.CorrelationIdConverter;

public class Circle implements Shape{



    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
    @Override
    public Shape clone() {
        return new Circle(this.radius);
    }

}
