package Shapes;

import shapeclass.*;

public class Circle extends Shape {

    double radius;

    public Circle() {
        radius = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String Color) {
        color = Color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    
    public void  setRadius(double NewRadius){
        this.radius = NewRadius;
    }
    
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle\nArea : " + getArea() + "\nPerimeter : " + getPerimeter()+"\nColor : "+color;
    }

}
