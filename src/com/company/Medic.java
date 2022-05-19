package com.company;

public class Medic extends Hero{
    private int healPoints = 10;
    @Override
    public String superAbility(String superAbility) {
        return "Medic superAbility " + superAbility;
    }
    public String increaseExperience(){
        return superAbility(healPoints + "%");
    }
}
