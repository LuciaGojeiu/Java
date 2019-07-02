package com.company.lab5.AnimalRescue;

public class Parrot extends Animal {
    private String feathers;

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public void talk(){
        System.out.println("Hello!");
    }


}
