
public class StudentManagement {
    private int n = 0;
    private boolean[] iterated = new boolean[100 + 5];
    private Student[] students = new Student[100 + 5];
    public void addStudent(Student newStudent) {
        if (n == 100) return;
        students[n] = new Student(newStudent);
        n++;
    }
    public void removeStudent(String id) {
        for (int i = 0; i < n;) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < n - 1; j++) {
                    students[j] = new Student(students[j + 1]);
                }
                n--;
            } else {
                i++;
            }
        }
    }
    public static boolean sameGroup(Student a, Student b) {
        return a.getGroup().equals(b.getGroup());
    }
    public String studentsByGroup() throws NullPointerException {
        String ret = "";
        for (int i = 0; i < n; i++) {
            iterated[i] = false;
        }
        for (int i = 0; i < n; i++) {
            if (iterated[i]) continue;
            if (students[i].getGroup() == null) {
                continue;
            }
            ret += students[i].getGroup() + "\n";
            for (int j = i; j < n; j++) {
                if (students[j].getGroup() == null) continue;
                if (sameGroup(students[i], students[j])) {
                    ret += students[j].getInfo() + "\n";
                    iterated[j] = true;
                }


            }

        }
        return ret;

    }
    public void main() {
        Student A = new Student ("Nguyen Van An", "17020001", "17020001@vnu.edu.vn");
        Student B = new Student ("Nguyen Van B", "17020002", "17020002@vnu.edu.vn");
        Student C = new Student ("Nguyen Van C", "17020003", "17020003@vnu.edu.vn");
        Student D = new Student ("Nguyen Van D", "17020004", "17020004@vnu.edu.vn");
        A.setGroup("K62CC");
        B.setGroup("K62CC");
        addStudent(A);
        addStudent(B);
        addStudent(C);
        addStudent(D);
        System.out.println(n);
        System.out.println(studentsByGroup());
        System.out.println();
        removeStudent("17020003");
        System.out.println(n);
        System.out.println();
        System.out.println(studentsByGroup());
        removeStudent("17020002");
        System.out.println(studentsByGroup());
        System.out.println();
        addStudent(B);
        System.out.println(n);
        System.out.println(studentsByGroup());
        System.out.println();
        removeStudent("17020001");
        addStudent(A);
        System.out.println(studentsByGroup());
        System.out.println();
        A.setName("Nguyen Van An2");
        A.setGroup("K63CD");
        addStudent(A);
        System.out.println(studentsByGroup());
        for (int i = 100; i < 110; i++) {
            System.out.println(iterated[i]);
        }
        removeStudent("3423432");
        studentsByGroup();
        System.out.println("Endtest");
    }

}
