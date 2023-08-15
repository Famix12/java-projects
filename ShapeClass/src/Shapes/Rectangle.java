package Shapes;

import shapeclass.*;

public class Rectangle extends Shape {

    double width, length;

    public Rectangle() {
        width = 0;
        length = 0;
    }

    public Rectangle(double W, double L) {
        this.width = W;
        this.length = L;
    }

    public Rectangle(double W, double L, String Color) {
        color = Color;
        this.width = W;
        this.length = L;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double NewWidth) {
        this.width = NewWidth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double NewLength) {
        this.length = NewLength;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle\nArea : " + getArea() + "\nPerimeter : " + getPerimeter()+"\nColor : "+color;
    }

}
