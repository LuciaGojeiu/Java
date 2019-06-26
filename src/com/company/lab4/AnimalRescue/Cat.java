package com.company.lab4.AnimalRescue;

public class Cat extends Animal {
    private String claws;
    public String getClaws() {
        return claws;
    }

    public void setClaws(String claws) {
        this.claws = claws;
    }

    public void meow(){
        System.out.println("Meow!");
    }
}
