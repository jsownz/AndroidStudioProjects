package com.example;

/**
 * Created by jason on 1/7/16.
 */
public class SuperSoldier extends Enemy {

    public SuperSoldier(int hitPoints, int lives){
        super(hitPoints, lives);
    }

    @Override
    public void takeDamage(int damage){
        super.takeDamage(damage/2);
    }

}
