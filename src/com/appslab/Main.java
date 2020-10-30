package com.appslab;

public class Main {

    public static void main(String[] args) {
        Person[] obj = new Person[]{
                new Person("John", 21, 23000),
                new Person("Steve", 32, 40000),
                new Person("Martin", 16, 2700)
        };
        System.out.println(obj[0].getBudget() + obj[1].getBudget() + obj[2].getBudget());
    }
}
