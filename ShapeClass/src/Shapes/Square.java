package Shapes;

public class Square extends Rectangle {

    //because all sides in the square are equal then we 
    //can use width or length of Rectangle as one of sides of a square 
    //in this case i'll use WIDTH as a SIDE.
    double side;

    public Square() {
        side = 0;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String Color) {
        color = Color;
        this.side = side;
    }

    double getSide() {
        return side;
    }

    void setSide(double NewSide) {
        this.side = NewSide;
    }

    public void setWidth(double NewWidth) {
        width = NewWidth;
    }

    public void setLength(double NewLength) {
        length = NewLength;
    }

    public String toString() {
        return "Square\nSide : " + side + "\nColor : " + color;
    }
}
