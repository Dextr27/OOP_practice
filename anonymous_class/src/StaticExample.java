//static blocks are executed before main method

public class StaticExample {

    static {
        System.out.println("Static block is invoked"); // 1st to be invoked
    }

    public StaticExample() {
        System.out.println("constructor is invoked"); // 4th to be invoked
    }

    public static String staticString = "static variable";

    public static void main(String[] args) {
        StaticExample staticExample = new StaticExample();
    }

    static {
        StaticMethod(); // 2nd to be invoked
        System.out.println("Static block 2 is invoked"); // 3rd to be invoked
    }

    public static void StaticMethod() {
        System.out.println("This is static method");
    }

}
