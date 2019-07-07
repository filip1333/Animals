package sda;

import java.util.Objects;

public class Food {

    FoodType foodType;
    int quantity;

    public Food(FoodType foodType, int quantity) {
        this.foodType = foodType;
        this.quantity = quantity;
    }

    public void addFood(Food foodToAdd) {
        quantity += foodToAdd.quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Food)) return false;
        Food food = (Food) o;
        return foodType == food.foodType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodType);
    }

    @Override
    public String toString() {
        return foodType.toString() + ": " + quantity;
    }

    public Food removeFood(Food toRemove) {
        int howMuchToShopping = 0;
        if (quantity >= toRemove.quantity) {
            quantity = this.quantity - toRemove.quantity;
            toRemove.quantity = 0;
        } else {
            howMuchToShopping = toRemove.quantity - this.quantity;
            quantity = 0;
            toRemove.quantity = howMuchToShopping;
        }
        return new Food(this.foodType, howMuchToShopping);
    }
}
