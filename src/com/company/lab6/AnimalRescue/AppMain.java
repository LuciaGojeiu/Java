package com.company.lab6.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Dog layla = new Dog();
        layla.setName("Layla");
        System.out.println(layla.getName());
        layla.setAge(5);
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
        layla.eat();
        layla.bark();

        Cat abby = new Cat();
        abby.setName("Abby");
        System.out.println(abby.getName());
        abby.setAge(2);
        System.out.println(abby.getAge());
        abby.setHealthLevel(9);
        System.out.println(abby.getHealthLevel());
        abby.setHungerLevel(1);
        System.out.println(abby.getHungerLevel());
        abby.setMoodLevel(10);
        System.out.println(abby.getMoodLevel());
        abby.setFavoriteActivity("Run");
        System.out.println(abby.getFavoriteActivity());
        abby.setFavoriteFood("Purina");
        System.out.println(abby.getFavoriteFood());
        abby.eat();
        abby.setClaws("Claws");
        System.out.println(abby.getClaws());
        abby.meow();

        Bird tweety = new Bird();
        tweety.setName("Tweety");
        System.out.println(tweety.getName());
        tweety.setAge(1);
        System.out.println(tweety.getAge());
        tweety.setHealthLevel(9);
        System.out.println(tweety.getHealthLevel());
        tweety.setHungerLevel(1);
        System.out.println(tweety.getHungerLevel());
        tweety.setMoodLevel(9);
        System.out.println(tweety.getMoodLevel());
        tweety.setFavoriteActivity("Fly");
        System.out.println(tweety.getFavoriteActivity());
        tweety.setFavoriteFood("Seeds");
        System.out.println(tweety.getFavoriteFood());
        tweety.eat();
        tweety.setFeathers("ColorfulFeathers");
        System.out.println(tweety.getFeathers());
        tweety.talk();

        Parrot tom=new Parrot();
        tom.talk();
        tom.talkT();
        tom.eat();

        Bird tim=new Parrot();
        tim.talk();
        tim.eat();

        Animal todd=new Parrot();
        todd.talk();
        todd.eat();

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

        Activity homeActivity = new Activity();
        homeActivity.setActivityName("Run");
        System.out.println(homeActivity.getActivityName());
        homeActivity.setActivityTime(10);
        System.out.println(homeActivity.getActivityTime());
        homeActivity.run();
        Activity homeActivity2=new Activity();
        homeActivity2.setActivityName("Play");
        System.out.println(homeActivity2.getActivityName());
        homeActivity2.setActivityTime(5);
        System.out.println(homeActivity2.getActivityTime());
        homeActivity.play();

        Vet john= new Vet();
        john.setName("John");
        System.out.println(john.getName());
        john.setSpecialization("Immunology");
        System.out.println(john.getSpecialization());
        john.setAge(40);
        System.out.println(john.getAge());
    }
}
