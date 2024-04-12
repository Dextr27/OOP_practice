import java.util.*;

//Ask a user of the ID number. The length must be 10 digits. If not, throw error.
class NumberLengthException extends Exception { // whenever a user defined exception is present, must be a sub-class of
                                                // exception
    StringBuffer number; // since string is immutable

    public NumberLengthException(String string, String no) {
        // The `super(string);` statement in the `NumberLengthException` constructor is
        // calling the
        // constructor of the superclass `Exception` with the provided `string`
        // parameter. This allows
        // the exception message to be set when the custom exception is thrown. By
        // calling
        // `super(string)`, the message passed to the constructor of
        // `NumberLengthException` is then
        // passed up to the constructor of `Exception`, which is the base class for all
        // exceptions in
        // Java.
        super(string);
        number = new StringBuffer(no);
    }

    public String toString() {
        return this.getMessage();
    }

    public int appendZero() {
        for (int i = number.length(); i < 10; i++) {
            number = number.append("0");
            return Integer.parseInt(number);
        }
    }

}

public class testException {
    public static void main(String args[]) throws NumberLengthException { // warning that we have this kind of
                                                                          // exception!! important
        Scanner scanner = new Scanner(System.in);
        String input = "";

        int num = 0, i = 0;

        System.out.println("Enter ID number");
        input = scanner.next(); // this takes it as string
        scanner.close();

        try {

            num = Integer.parseInt(input);

            if (input.length() != 10) {
                throw new NumberLengthException("invalid number! try again");
            }
            System.out.println("correct");
        }

        catch (NumberFormatException e) {

            System.out.println(e.getMessage());
            System.out.println(e + "Not a valid number");
        }

        System.err.println(num);

    }

}