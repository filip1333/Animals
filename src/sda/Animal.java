package sda;

import java.util.Arrays;
import java.util.List;

public abstract class Animal {

    String name;
    Fridge hungry = new Fridge();

    public Animal(String name) {
        super();
        this.name = name;
    }

    public String introduceSelf()   {
        return animalType() + " " + name + ", I want eat: " + hungry.toString();
    }

    protected abstract String animalType();

    public abstract String getVoice();

    @Override
    public String toString()    {
        return introduceSelf();
    }

    public void addHunger(Food foodToAdd)   {
        hungry.addFood(foodToAdd);
    }

    public Fridge getHunger()   {
        return hungry;
    }

    public List<FoodType> getMenu() {
        return Arrays.asList();
    }
}
