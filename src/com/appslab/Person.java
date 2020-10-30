package com.appslab;

public class Person {
    private String name = "John";
    private int Age = 21;
    private int Budget = 23000;

    public Person(String name, int Age, int Budget){
        this.name = name;
        this.Age = Age;
        this.Budget = Budget;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getBudget() {
        return Budget;
    }

    public void setBudget(int budget) {
        Budget = budget;
    }
}
