public class Main {
    public static void main (String[] args) {
        Person person = new Person("xx", "yy");
        Student student = new Student("xx", "yy", "zz", 1900, 3.32);
        Staff staff = new Staff("xx", "yy", "zz", 0.353243);
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(staff.toString());
    }
}
