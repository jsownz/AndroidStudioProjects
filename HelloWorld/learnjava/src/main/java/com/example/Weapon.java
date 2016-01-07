package com.example;

/**
 * Created by jason on 1/7/16.
 */
public class Weapon {
    private String name;
    private int damage;
    private int hitPoints;


    public Weapon(String name, int damage, int hitPoints) {
        this.name = name;
        this.damage = damage;
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
