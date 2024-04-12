class Name {

    private String fname;
    private String mname;
    private String lname;
    // provide accessor methods as per the given specification
    // provide implementation for getName() method as per the given
    // specification

    String getFirstName() {
        return fname;
    }

    String getMiddleName() {
        return mname;
    }

    String getLastName() {
        return lname;
    }

    Name(String name) {
        /*
         * Complete the constructor by extracting the values of three name
         * fields. Note that name value may be either comma separated or
         * semicolon separated
         * 
         * If the value supplied for constructor parameter is “Rajesh,Kumar,Khanna” the
         * Firstname is “Rajesh”, Middle Name is “Kumar” and Last name is “Khanna” .
         */
        Name name1 = new Name(name);
        System.out.println(name1.getFirstName() + " " + name1.getMiddleName() + " " + name1.getLastName());

    }

}
