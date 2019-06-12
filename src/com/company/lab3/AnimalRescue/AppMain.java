package com.company.lab3.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Pet layla = new Pet();
        System.out.println(layla.petName);
        System.out.println(layla.age);
        System.out.println(layla.healthLevel);
        System.out.println(layla.hungerLevel);
        System.out.println(layla.moodLevel);
        System.out.println(layla.favoriteActivity);
        System.out.println(layla.favoriteFood);

        Adopter penny = new Adopter();
        System.out.println(penny.adopterName);
        System.out.println(penny.money);
        System.out.println(penny.adopterAge);

        Food purina = new Food();
        System.out.println(purina.foodName);
        System.out.println(purina.foodPrice);
        System.out.println(purina.foodQuantity);
        System.out.println(purina.foodCart);

        Activity walk = new Activity();
        System.out.println(walk.activityName);

        Vet john= new Vet();
        System.out.println(john.vetName);
        System.out.println(john.vetSpecialization);

    }
}
