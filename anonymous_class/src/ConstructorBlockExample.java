public class ConstructorBlockExample {
    {

        System.out.println("Instance block is invoked"); // 1st to be invoked
        // will again be invoked when the second object is created
    }

    public ConstructorBlockExample() {
        System.out.println("constructor is invoked"); // 3rd to be invoked
    }

    public ConstructorBlockExample(String param1) {
        System.out.println("this is a single parameter constructor");
    }

    {
        System.out.println("This is second constructor block"); // 2nd to be invoked
        // will again be invoked when the second object is created
    }

    public static void main(String[] args) {

        ConstructorBlockExample constructorBlockExample = new ConstructorBlockExample();
        ConstructorBlockExample constructorBlockExample1 = new ConstructorBlockExample("param1");
    }

}
