public class Cylinder extends Circle {

    private double height;

    public Cylinder() { // constructor 1
        super(); // invoke superclass' constructor Circle()
        height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius); // invoke superclass constructor Circle(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

}
