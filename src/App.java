public class App {
    public static void main(String[] args) throws Exception {

        Student Abdullah = new Student("Abdullah Bin Essa", "RSS");
        Teacher Mostafa = new Teacher("Arabic", "RSS", "Mostafa", "BMW");
        Abdullah.describeRole();
        Mostafa.describeRole();
        Mostafa.carTeacherDrives();

    }
}
