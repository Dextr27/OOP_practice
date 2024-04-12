// No super Access:

// Static blocks exist at the class level, not the object level. Therefore, super is not applicable here.
// No Return Statements:

// Static blocks are code blocks, not methods. They cannot have return statements as they don't return any value.

class MyStatic {

    int a;
    static int b; // initial is 0
    // constructor incrementing the static variable

    MyStatic() {
        b++;
    }

    public void show() {
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }

}

public class StaticDemo {

    public static void main(String[] args) {
        MyStatic s1 = new MyStatic();
        s1.show();

        MyStatic s2 = new MyStatic(); // has the memory of the previous object
        s2.show();

    }
}
