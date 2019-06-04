package com.company.lab2.AnimalRescue;

public class Main {
    public static void main(String[] args) {
        Pet Layla = new Pet();
        System.out.println(Layla.petName);
        System.out.println(Layla.age);
        System.out.println(Layla.healthLevel);
        System.out.println(Layla.hungerLevel);
        System.out.println(Layla.moodLevel);
        Layla.favoriteFood();
        Layla.favoriteActivity();

        Adopter Penny = new Adopter();
        System.out.println(Penny.adopterName);
        System.out.println(Penny.money);

        Food Purina = new Food();
        System.out.println(Purina.foodName);
        System.out.println(Purina.foodPrice);
        System.out.println(Purina.foodQuantity);
        System.out.println(Purina.foodCart);

        Activity Walk = new Activity();
        Walk.activityName();

        Vet Pop = new Vet();
        System.out.println(Pop.vetName);
        System.out.println(Pop.vetSpecialization);

    }
}
