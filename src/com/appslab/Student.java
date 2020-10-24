package com.appslab;

public class Student {
    private String name = "John";
    private int StudentNumber = 2;
    private int PhoneNumber = 123456;
    private String Address = "Legionarska 1, 01001 Zilina";
    public void setName(String name, int StudentNumber, int PhoneNumber, String Address){
    }

public Student(String name, int StudentNumber, int PhoneNumber, String Address){
 this.name = name;
 this.StudentNumber = StudentNumber;
 this.PhoneNumber = PhoneNumber;
 this.Address = Address;
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

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void Address(String Address) {
        this.Address = Address;
    }
}
