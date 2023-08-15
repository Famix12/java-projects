package shapeclass;

import Shapes.*;

public class ShapeClass {

    public static void main(String[] args) {

        Circle C = new Circle(2.0, "Blue");
        Rectangle R = new Rectangle(5, 4, "Green");
        Square S = new Square(8.0, "Gray");

        System.out.println(C.toString() + "\nArea : " + C.getArea() + "\nPerimeter" + C.getPerimeter());

        System.out.println("----------------------------------");

        System.out.println(R.toString() + "\nArea : " + R.getArea() + "\nPerimeter" + R.getPerimeter());

        System.out.println("----------------------------------");

        System.out.println( S.toString());
    }

}
