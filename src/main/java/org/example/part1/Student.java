package org.example.part1;

import java.util.List;

public class Student {

    private int id;
    private String name;
    private String section;
    private String course;

    public Student(int id, String name, String section, String course){
        this.id = id;
        this.name = name;
        this.section = section;
        this.course = course;
    }

    public Student(){

    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSection(){
        return section;
    }

    public void setSection(String section){
        this.section = section;
    }


    public String getCourse(){
        return course;
    }

    public void setCourse(String course){
        this.course = course;
    }


    public  void  getAllValue(){
      System.out.println("Name:" + name + "Section: " + section);
    }


}
