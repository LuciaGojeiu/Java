package com.company.lab2.AnimalRescue;

public class Main {
    public static void main(String[] args) {
        Pet Layla = new Pet();
        System.out.println(Layla.age);
        System.out.println(Layla.healthLevel);
        System.out.println(Layla.hungerLevel);
        System.out.println(Layla.moodLevel);
        Layla.favoriteFood();
        Layla.favoritePlay();

        Adopter Penny = new Adopter();
        System.out.println(Penny.money);

        Food Purina = new Food();
        System.out.println(Purina.foodPrice);
        System.out.println(Purina.foodQuantity);
        System.out.println(Purina.foodCart);

        PlayActivity Walk = new PlayActivity();
        System.out.println(Walk.activityTime);

        Vet Pop = new Vet();
        System.out.println(Pop.vetSpecialization);

    }
}
