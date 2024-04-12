class Student {
    private Name name; // name of student
    private int age;// age of student
    /*
     * Complete the Student class by adding proper constructor, accessor methods and
     * by adding any other method which are required as per specification
     */

    Name getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    @Override
    public String toString() { // important
        return name.getFirstName() + " " + name.getMiddleName() + " " + name.getLastName() + " " + age;
    }

}
// End of Student class