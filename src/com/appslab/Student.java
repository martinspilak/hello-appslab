package com.appslab;

public class Student {
    private String name = "John";
    private int StudentNumber = 12345;
    public void setName(String name, int StudentNumber){
    }

public Student(String name, int StudentNumber){
 this.name = name;
 this.StudentNumber = StudentNumber;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        StudentNumber = studentNumber;
    }
}
