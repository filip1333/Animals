package sda;

import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Person mirek = new Person("Mirek");

        Thread feeding = new Thread() {

            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(400000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("I'm feeding pets");
                    mirek.feedAnimals();
                    System.out.println(mirek.introduceSelf());
                }
            }
        };
        feeding.start();

        Thread goShopping = new Thread() {

            @Override
            public void run() {
                while (true) {
                    try {
                        int shoppingTimeout = 10000;
                        Thread.sleep(shoppingTimeout);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("I'm going shopping");
                    System.out.println(mirek.shoppingList);
                }
            }
        };
        goShopping.start();

        Thread addHunger = new Thread() {

            @Override
            public void run() {
                while (true) {
                    try {
                        int hungerTimeout = 1500;
                        Thread.sleep(hungerTimeout);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Hungry!");

                    Random random = new Random();
                    int indexAnimal = random.nextInt(mirek.myAnimals.size());
                    Animal animal = mirek.myAnimals.get(indexAnimal);
                    System.out.println(mirek.introduceSelf());
                    List<FoodType> foodType = animal.getMenu();
                }
            }
        };
        addHunger.start();

        Dog azorek = new Dog("Azorek");
        Cat loki = new Cat ("Loki");
        Bird puchatek = new Bird ("Puchatek");
        Fish topr = new Fish ("Topr Thora");
        mirek.addAnimal(azorek);
        mirek.addAnimal(loki);
        mirek.addAnimal(puchatek);
        mirek.addAnimal(topr);

        Food milkToFridge = new Food(FoodType.MILK, 4);
        Food meatToFridge = new Food(FoodType.MEAT, 4);
        Food grainToFridge = new Food(FoodType.GRAIN, 24);
        Food cheeseToFridge = new Food(FoodType.CHEESE, 14);

        mirek.addToFrige(milkToFridge);
        mirek.addToFrige(meatToFridge);
        mirek.addToFrige(grainToFridge);
        mirek.addToFrige(cheeseToFridge);

        Food meatDogsHunger = new Food(FoodType.MEAT, 2);
        Food grainDogsHunger = new Food(FoodType.GRAIN, 4);
        azorek.addHunger(meatDogsHunger);
        azorek.addHunger(grainDogsHunger);

        Food milkBirdsHunger = new Food(FoodType.MILK, 4);
        Food cheeseBirdsHunger = new Food(FoodType.CHEESE, 1);
        puchatek.addHunger(milkBirdsHunger);
        puchatek.addHunger(cheeseBirdsHunger);

        System.out.println("((--BEFORE FEEDING--))");
        System.out.println(mirek.introduceSelf());

        System.out.println("((--AFTER FEEDING--))");
        System.out.println(mirek.introduceSelf());
    }

}
