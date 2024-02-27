public class Main {
    public static void main(String[] args) {
        Person student = new Student("Elbek", "Surxondaryo", "Daturiy injinering", 2002, 2000000);
        System.out.println(student.toString());
        System.out.println();

        Person staff = new Staff("Elbek", "Syrxondaryo", "34-maktab", 7092000);
        System.out.println(staff.toString());
    }
}