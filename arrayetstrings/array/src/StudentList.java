public class StudentList {

    public static Student[] list = new Student[10];

    public static int count = 0;

    public static void addStudent(Student student) {
        list[count] = student;
        count++;
    }

    public static Student getStudentsWithAge(int age) {
        /*
         * This method returns all the students whose age is equal to age
         * parameter of this method. If no such student is found then it
         * returns null.
         */

        for (int i = 0; i < count; i++) {
            if (list[i].getAge() == age) { // to retrieve age of the student, we use the get method
                return list[i]; // adjust since return type is NOT an array
            }

            else {
                return null;
            }
        }

    }

    public static Student getStudentsWithLastName(String lastName) {
        /*
         * This method returns all the students whose last name attribute
         * value matches with lastName parameter of this method. If no such
         * students is found then it returns null.
         */

        for (int i = 0; i < count; i++) {
            if (list[i].getName().getLastName() == lastName) {
                return list[i];
            } else {
                return null;
            }
        }

    }

    public static Student getStudentsInRange(int minAge, int maxAge) {
        /*
         * This method returns all the students whose age falls between minAge
         * and maxAge (both parameters inclusive)
         */

        for (int i = 0; i < count; i++) {
            if (list[i].getAge() >= minAge && list[i].getAge() <= maxAge) {
                return list[i];
            }

        }

    }
}
// End of class StudentList
