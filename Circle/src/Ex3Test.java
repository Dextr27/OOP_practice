class A {
    public int a = 100;
} // End of class A

class B extends A {
    public int a = 80;
} // End of class B

class C extends B {
    public int a = 60;
} // End of class C

class D extends C {
    public int a = 40;
} // End of class D

class E extends D {
    public int a = 10;

    public void show() {
        int a = 0;
        // Write Java statements to display the values of
        // all a’s used in this file on System.out
        A first = new A();
        B second = new B();
        C third = new C();
        D fourth = new D();
        E fifth = new E();

        System.out.println(first.a);
        System.out.println(second.a);
        System.out.println(third.a);
        System.out.println(fourth.a);
        System.out.println(fifth.a);

    } // End of show() Method
}// End of class E

public class Ex3Test {
    public static void main(String args[]) {
        new E().show(); // This is an example of anonymous object
        A a1 = new E();
        D d1 = (D) a1; // what’s wrong with this statement?
    }// End of main()
}// End of class EX3Test
