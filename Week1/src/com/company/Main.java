package com.company;

public class Main {

    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.main(args);
        Student a, b, c;
        a = new Student("A", "1", "AA");
        b = new Student("B", "2", "BB");
        c = new Student("C", "3", "CC");
        a = b;

        System.out.println(a.getInfo());
        System.out.println(b.getInfo());
        b = new Student(c);
        System.out.println(a.getInfo());
        System.out.println(b.getInfo());
        c.setName("dsads");
        System.out.println(b.getInfo());
        System.out.println(c.getInfo());

    }
}
