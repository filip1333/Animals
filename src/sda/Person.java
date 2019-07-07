package sda;

import java.util.*;

public class Person {
    String name;
    List<Animal> myAnimals = new ArrayList<>();
    Fridge fridge = new Fridge();
    Fridge shoppingList = new Fridge();

    public Person(String name) {
        this.name = name;
    }


        public void feedAnimals() {
            for (Animal animalsToFeed : myAnimals) {
                Fridge hunger = animalsToFeed.getHunger();
                for (int index = 0; index < hunger.howManyMeals(); index++) {
                    Food whatWantsEat = hunger.takeFood(index);
                    Food howMuchMissing = fridge.takeFromFridge(whatWantsEat);
                    shoppingList.addFood(howMuchMissing);

                }
            }
        }

        public String introduceSelf()  {
            return toString();
        }

        public void addAnimal(Animal animal)    {
            myAnimals.add(animal);
        }

        public void addToFrige(Food foodToAdd) {
            fridge.addFood(foodToAdd);
        }

        public void addToShoppingList(Food foodToAdd)   {
            shoppingList.addFood(foodToAdd);
        }

        @Override
        public String toString()    {
            return "My name is: " + name + ".\nI have: " + myAnimals.size() + " animals: " + myAnimals.toString() + ".\nIn the fridge I have: " + fridge.toString() + ".\nI must buy: " + shoppingList.toString();
        }
}
