// Overloaded methods:
//  appear in the same class or a subclass
//  have the same name but,
//  have different parameter lists, and,
//  can have different return types

public class room {

    double length, breadth, height;

    room() {
        length = -1;
        breadth = -1;
        height = -1;
    }

    room(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    room(double len) {
        length = breadth = height = len;
    }

    double volume() {
        return length * breadth * height;
    }

}

class OverloadConstructors {
    public static void main(String args[]) {
        room a = new room(20, 30, 40);
        room b = new room();
        room c = new room(10);
        double vol;
        vol = a.volume();
        System.out.println("Volume of room a is " + vol);
        vol = b.volume();
        System.out.println("Volume of room b is " + vol);
        vol = c.volume();
        System.out.println("Volume of room c is " + vol);
    }
}
