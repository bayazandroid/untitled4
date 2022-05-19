package com.company;

public class Main {

    public static void main(String[] args) {
        Hero[] heroes = {new Magic(), new Medic(), new Warrior()};
        for (int i = 0; i < heroes.length; i++) {
            heroesAbility(heroes[i]);
        }
    }

    public static void heroesAbility(Hero hero){
        System.out.println(new Magic().superAbility("magic"));
        System.out.println(new Medic().superAbility("medic"));
        System.out.println(new Warrior().superAbility("critical damage"));
        System.out.println(new Medic().increaseExperience());
    }
}
