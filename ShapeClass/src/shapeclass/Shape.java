package shapeclass;

 public abstract class Shape {

     public String color;

    public Shape() {
        color = "No color was entered !!";
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String Newcolor) {
        this.color = Newcolor;
    }

   public abstract double getArea();

    public abstract double getPerimeter();

    
    public abstract String toString();

}
