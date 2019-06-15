package com.company.lab3.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Dog layla = new Dog();
        layla.setName("Layla");
        System.out.println(layla.getName());
        layla.setAge(2);
        System.out.println(layla.getAge());
        layla.setHealthLevel(9);
        System.out.println(layla.getHealthLevel());
        layla.setHungerLevel(2);
        System.out.println(layla.getHungerLevel());
        layla.setMoodLevel(10);
        System.out.println(layla.getMoodLevel());
        layla.setFavoriteActivity("Run");
        System.out.println(layla.getFavoriteActivity());
        layla.setFavoriteFood("Pedigree");
        System.out.println(layla.getFavoriteFood());

        Adopter penny = new Adopter();
        penny.setAdopterName("Penny");
        System.out.println(penny.getAdopterName());
        penny.setMoney(1000);
        System.out.println(penny.getMoney());
        penny.setAdopterAge(15);
        System.out.println(penny.getAdopterAge());

        Food purina = new Food();
        purina.setFoodName("Purina");
        System.out.println(purina.getFoodName());
        purina.setFoodPrice(10);
        System.out.println(purina.getFoodPrice());
        purina.setFoodQuantity(4);
        System.out.println(purina.getFoodQuantity());
        purina.setFoodCart(22);
        System.out.println(purina.getFoodCart());

        Activity walk = new Activity();
        walk.setActivityName("Walk");
        System.out.println(walk.getActivityName());
        walk.setActivityTime(10);
        System.out.println(walk.getActivityTime());

        Vet john= new Vet();
        john.setVetName("John");
        System.out.println(john.getVetName());
        john.setVetSpecialization("Immunology");
        System.out.println(john.getVetSpecialization());

    }
}
