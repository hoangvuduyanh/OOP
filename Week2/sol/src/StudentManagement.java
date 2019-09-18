import java.util.HashMap;
import java.util.Map;

public class StudentManagement {

	private Student[] students = new Student[100];
	private int nStudent = 0;

	public static boolean sameGroup(Student studentCurrent, Student otherStudent) {
		return studentCurrent.getGroup().equals(otherStudent.getGroup());
	}

	public void addStudent(Student newStudent){
		students[nStudent] = newStudent ;
		nStudent++;
	}

	public String studentsByGroup() throws NullPointerException {
		Map<String, Integer> groupMap = new HashMap<>();
		StringBuilder stringResult = new StringBuilder();
		for(int i = 0; i < nStudent; ++i){
			Student student = students[i] ;
			String idClass = student.getGroup();
			if (groupMap.get(idClass) == null) {
				StringBuilder listClass = new StringBuilder(idClass + "\n");
				groupMap.put(idClass, 1);
				for(int j = 0; j < nStudent; ++j) {
					Student otherStudent = students[j];
					if (otherStudent.getGroup() == null || student.getGroup() == null) continue;
					if (student.getGroup().equals(otherStudent.getGroup())){
						listClass.append(otherStudent.getInfo());
						listClass.append("\n");
					}
				}
				stringResult.append(listClass.toString());
			}
		}
		return stringResult.toString();
	}

	public void removeStudent(String id) {
		for (int i = 0; i < nStudent ; i++) {
			Student student = students[i];
			if (student.getId().equals(id)) {
				for (int j = i + 1; j < nStudent; ++j){
					Student copyStudent = new Student(students[j]);
					students[j - 1] = new Student(copyStudent);
				}
			}
		}
		nStudent--;
	}

	public static void main(String[] args) {
		StudentManagement studentManagement = new StudentManagement();
        Student initStudent = new Student("Le Quang Duy", "18020411", "uet@vnu.edu.vn");
		Student otherStudent = new Student("Thadeus Draze", "18020412", "uet@vnu.edu.vn");
		Student otherStudent1 = new Student("Nguyen Hoai Nam", "18020413", "uet@vnu.edu.vn");
		otherStudent.setGroup("K63K2");
		Student otherStudent2 = new Student("Nguyen Minh Dat", "18020414", "uet@vnu.edu.vn");
        studentManagement.addStudent(initStudent);
		studentManagement.addStudent(otherStudent);
		studentManagement.addStudent(otherStudent1);
		studentManagement.addStudent(otherStudent2);
		System.out.println(studentManagement.studentsByGroup());
        studentManagement.removeStudent("18020411");
		System.out.println(studentManagement.studentsByGroup());
	}
}
