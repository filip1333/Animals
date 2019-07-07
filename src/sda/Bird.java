package sda;

import java.util.Arrays;
import java.util.List;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    protected String animalType() {
        return "bird";
    }

    @Override
    public String getVoice() {
        return "gravel gravel";
    }

    public List<FoodType> getMenu() {
        return Arrays.asList(FoodType.GRAIN);
    }
}