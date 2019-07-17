package com.company.lab7.AnimalRescue;

public class Cat extends Animal {
    private String claws;
    public String getClaws() {
        return claws;
    }

    public void setClaws(String claws) {
        this.claws = claws;
    }

    public void eat(){
        System.out.println("The cat is eating a lot of food.");
    }
    public void talk() {
        System.out.println("The cat makes a sound!");
    }
    public void meow(){
        System.out.println("Meow!");
    }
}
