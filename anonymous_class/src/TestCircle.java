class Circle { // default would be package-private

    static double PI; // final variable should always be initialized
    static public double radius; // post static variable, it can added to a static method

    Circle(double radius) {
        this.radius = radius;
        Circle.PI = 3.14159;
    }

    // accessor method
    public double getRadius() {
        return radius;
    }

    // mutator method
    public double setRadius(double radius) {
        this.radius = radius;

        return radius;
    }

    public static double area() {
        return PI * radius * radius;
    }

    // static method's are not instance specific
    public static void getCircumference(double radius) {
        // here radius variable is a local variable
        System.out.println("Circumference = " + 2 * PI * radius);
    }
}// End of circle

public class TestCircle {
    public static void main(String args[]) {
        Circle c1 = new Circle(2.3);
        c1.area();

        System.out.println("the area of the circle is: " + c1.area());

        // You are absolutely correct. In Java, methods only inherently "show" output if
        // they use some kind of printing mechanism like System.out.println.
        // The return statement itself doesn't directly display anything on the console.

        // accessing static method with class name
        Circle.getCircumference(2.3);
        Circle c2 = new Circle(3.45);
        c2.area();
        // accessing static method with references is discouraged
        c2.getCircumference(3.45);
        /*
         * 1. Make the area function as static and observe the
         * output
         */
        /*
         * 2. Remove the formal argument from getCircumference()
         * method and observe the output
         * 3. Rename static to final and observe the error(s) and
         * correctthem
         */
    } // end of main
} // end of class
