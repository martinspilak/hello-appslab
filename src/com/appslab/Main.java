package com.appslab;

public class Main {

    public static void main(String[] args) {
        Employee  employee = new Employee ("Jozko", "Mrkvicka", "4.7.1990", "IT programmer", 2100 );
        System.out.println(employee.getName() + " " + employee.getSurname() + ", " + employee.getDateOfBirth() + ", " + employee.getJobPosition()+ ", " + employee.getSalary());
        }


    }

