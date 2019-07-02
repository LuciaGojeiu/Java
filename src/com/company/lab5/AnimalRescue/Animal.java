package com.company.lab5.AnimalRescue;

public class Animal {
    private String name;
    private int age;
    private int healthLevel;
    private int hungerLevel;
    private int moodLevel;
    private String favoriteFood;
    private String favoriteActivity;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }
    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }
    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = moodLevel;
    }
    public int getMoodLevel() {
        return moodLevel;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteActivity(String favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }
    public String getFavoriteActivity() {
        return favoriteActivity;
    }

    public void eat(){
        System.out.println("The animal is eating a lot of food.");
    }
}
