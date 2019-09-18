package com.company;

public class Student {
    private String name, id, group, email;
    public Student() {
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }
    public Student (String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";

    }
    public Student (Student student) {
        this.name = student.getName();
        this.id = student.getId();
        this.group = student.getGroup();
        this.email = student.getEmail();
    }

    public void setName (String name) { this.name = name; }
    public String getName () { return name; }

    public void setId (String id) { this.id = id; }
    public String getId () { return id; }

    public void setGroup (String group) { this.group = group; }
    public String getGroup () { return group; }

    public void setEmail (String email) { this.email = email; }
    public String getEmail() { return email; }

    public String getInfo () {
        String ret = name + " - " + id + " - " + group + " - " + email;
        return ret;
    }
}
