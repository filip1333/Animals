package sda;

import java.util.Arrays;
import java.util.List;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    protected String animalType() {
        return "dog";
    }

    @Override
    public String getVoice() {
        return "hau hau";
    }

    public List<FoodType> getMenu() {
        return Arrays.asList(FoodType.BREAD, FoodType.MEAT, FoodType.MILK);
    }
}