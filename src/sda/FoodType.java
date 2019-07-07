package sda;

import java.util.ArrayList;
import java.util.List;

public enum FoodType {

    GRAIN("grain"),
    MEAT("meat"),
    MILK("milk"),
    CHEESE("cheese"),
    BREAD("bread"),
    FISHFOOD("fish food");

    String myDesignation;

    FoodType(String designation){
        myDesignation = designation;
    }

    @Override
    public String toString() {
        return myDesignation;
    }
}
