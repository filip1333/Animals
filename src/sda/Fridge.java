package sda;

import java.util.ArrayList;
import java.util.List;

public class Fridge {

    List<Food> food = new ArrayList<>();

    public void addFood(Food foodToAdd) {

        int indexFood = food.indexOf(foodToAdd);
        if (indexFood >= 0) {
            Food foodFromFridge = food.get(indexFood);
            foodFromFridge.addFood(foodToAdd);
        } else {
            food.add(foodToAdd);

        }
    }

    @Override
    public String toString() {
        return food.toString();
    }

    public int howManyMeals() {
        return food.size();
    }

    public Food takeFood(int index) {
        return food.get(index);
    }

    public Food takeFromFridge(Food whatWantEat) {
        int index = food.indexOf(whatWantEat);
        if (index >= 0) {
            Food foodInFridge = this.food.get(index);
            return foodInFridge.removeFood(whatWantEat);
        }   else    {
            return whatWantEat;

        }
    }

    public void removeFromFridge(int i)   {
        food.remove(i);

    }
}

