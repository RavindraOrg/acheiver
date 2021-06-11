package com.inheritance.example;
public class Animal {

    private String name="Elaphant";

    public Animal(){

       // System.out.println("In animal class");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
