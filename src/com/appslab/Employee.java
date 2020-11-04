package com.appslab;

public class Employee {
    private String name = "Jozko";
    private String surname = "Mrkvicka";
    private String dateOfBirth ="4.7.1990";
    private String jobPosition = "IT programmer";
    private int salary = 2100;

    public Employee(String name, String surname, String dateOfBirth, String jobPosition, int salary){
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.jobPosition = jobPosition;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
