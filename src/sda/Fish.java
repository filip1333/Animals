package sda;

import java.util.Arrays;
import java.util.List;

public class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }

    @Override
    protected String animalType() {
        return "fish";
    }

    @Override
    public String getVoice() {
        return "...";
    }

    public List<FoodType> getMenu() {
        return Arrays.asList(FoodType.FISHFOOD);
    }
}