package sda;

import java.util.Arrays;
import java.util.List;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    protected String animalType() {
        return "cat";
    }

    @Override
    public String getVoice() {
        return "meow meow";
    }

    public List<FoodType> getMenu() {
        return Arrays.asList(FoodType.MEAT, FoodType.MILK);
    }
}