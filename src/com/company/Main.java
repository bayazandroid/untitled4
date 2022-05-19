package com.company;

public class Main {

    public static void main(String[] args) {
        Hero[] heroes = {new Magic(), new Medic(), new Warrior()};
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].superAbility("magic"));
        }
    }
}
