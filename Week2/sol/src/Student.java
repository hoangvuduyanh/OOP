public class Student {
	private String group;
	private String email;
	private String id;
	private String name;

	public String getGroup() {
		return group.trim();
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student() {
		this.name = "Student";
		this.id = "000";
		this.group = "K62CB";
		this.email = "uet@vnu.edu.vn";
	}
	public Student(String name, String id, String email){
		this.group = "K62CB";
		this.name = name;
		this.id = id;
		this.email = email;
	}
	public Student(Student otherStudent){
		this.email = otherStudent.email;
		this.name = otherStudent.name;
		this.id= otherStudent.id;
		this.group = otherStudent.group;
	}

	public String getInfo() {
		// TODO:
		String stringAns = this.name +
				" - " +
				this.id +
				" - " +
				this.group +
				" - " +
				this.email;
		return stringAns;
	}

	public static void main(String[] args) {
		Student test = new Student();
		Student nguyen_hoai_nam = new Student("Nguyen Hoai Nam", "18020929", "18020929@vnu.edu.vn");
		Student copyStudet = new Student(nguyen_hoai_nam) ;
		System.out.println(test.getInfo());
		System.out.println(copyStudet.getInfo());
	}
}


