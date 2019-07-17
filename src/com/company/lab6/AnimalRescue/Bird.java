package com.company.lab6.AnimalRescue;

public class Bird extends Animal {
    private String feathers;

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public void eat(){
        System.out.println("The bird is eating a lot of food.");
    }
    public void talk() {
        System.out.println("The bird makes a sound!");
    }

}
