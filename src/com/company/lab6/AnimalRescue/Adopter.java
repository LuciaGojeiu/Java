package com.company.lab6.AnimalRescue;

public class Adopter {
    private String adopterName;
    private int money;
    private int adopterAge;

    public void setAdopterName(String adopterName){
        this.adopterName=adopterName;
    }
    public String getAdopterName(){
        return adopterName;
    }

    public void setMoney(int money){
        this.money=money;
    }
    public int getMoney(){
        return money;
    }

    public void setAdopterAge(int adopterAge){
        this.adopterAge=adopterAge;
    }
    public int getAdopterAge() {
        return adopterAge;
    }
}
