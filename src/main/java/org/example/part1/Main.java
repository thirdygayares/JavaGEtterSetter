package org.example.part1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //one object
        Student student = new Student();

        student.setId(1);
        student.setName("Hannah");
        student.setSection("BSIT-4A");
        student.setCourse("COMPUTER SCIENCE");

        System.out.println("STUDENT NAME: " + student.getName());
        System.out.println("SECTION: " + student.getSection());
        System.out.println("COURSE: " + student.getCourse());


        Student student2 = new Student();

        student2.setId(2);
        student2.setName("JORIM");
        student2.setSection("BSIT-3A");
        student2.setCourse("COMPUTER ENGINEER");

        System.out.println("STUDENT NAME: " + student2.getName());
        System.out.println("SECTION: " + student2.getSection());
        System.out.println("COURSE: " + student2.getCourse());


    }
}