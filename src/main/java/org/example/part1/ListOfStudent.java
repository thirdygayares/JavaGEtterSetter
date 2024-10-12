package org.example.part1;

import java.util.ArrayList;
import java.util.List;

public class ListOfStudent {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "Hannah", "BSIT4B", "COmputer Science"));
        studentList.add(new Student(2, "Hobayan", "BSIT4B", "COmputer Science"));
        studentList.add(new Student(3, "Pablico", "BSIT4B", "COmputer Science"));
        studentList.add(new Student(4, "Aldrin", "BSIT4B", "COmputer Science"));
        studentList.add(new Student(5, "Rose", "BSIT4B", "COmputer Science"));
        studentList.add(new Student(6, "Dolinog", "BSIT4B", "COmputer Science"));

        System.out.println("My Object is " + studentList.get(2).getName());

        for(int i=0; i < studentList.size(); i++){
            studentList.get(i).getAllValue();
        }
    }

}
