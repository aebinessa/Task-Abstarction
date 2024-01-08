class Teacher extends Person {
    private String subject; // Specific property for Artist
    private String school; // Specific property for Artist

    // Constructor
    public Teacher(String subject, String school, String name) {
        super(name); // Initialize name from Person class
        this.subject = subject; // Initialize subject specific to Artist
        this.school = school; // Initialize subject specific to Artist
    }

    // Implementing the abstract method from Person
    @Override
    void describeRole() {
        System.out.println(getName() + " is a " + subject + " teacher at " + school + " school");
    }

    // generate setter and getter for subject and schools
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}