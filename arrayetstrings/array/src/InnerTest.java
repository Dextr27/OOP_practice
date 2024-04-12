import java.io.IOException;
import java.util.Scanner;

public class InnerTest {

}

class Test {
    public static Student readStudent() throws IOException {
        /*
         * This method reads the student details and returns the Student instance.
         * Values to be read from System.in are:
         * 1. First name of Student, 2. Middle name of student, 3. Last name of
         * Student, 4. Name format (1 for comma(,) separated and 2 for semicolon
         * separated), 5. age of student
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name of the student: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter the middle name of the student: ");
        String middlename = scanner.nextLine();
        System.out.println("Enter the last name of the student: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter the name format (1 for comma separated and 2 for semicolon separated): ");
        int nameFormat = scanner.nextInt();
        System.out.println("Enter the age of the student: ");
        int age = scanner.nextInt();
        scanner.close();

    } // End of readStudent() Method

    public static void main(String args[]) throws IOException {
        /*
         * 1. Write java code for reading details of 10 students and add them
         * in the static list ofStudentListclass.
         */
        /*
         * 2. Write java code for displaying the all the students with age 20 from
         * static list field of StudentList class
         */
        /*
         * 3. Write java code for displaying the student details for all students
         * having last name “Sharma” from static list of StudentList class
         */
        /*
         * 4. Write java code for displaying all the students whose age falls in
         * the range minAge = 16 and maxAge = 20 from static list of StudentList
         * class
         */
    }// End of main() Method
}// End of Test class
