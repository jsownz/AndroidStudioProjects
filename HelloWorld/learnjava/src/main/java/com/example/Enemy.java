package com.example;

/**
 * Created by jason on 1/7/16.
 */
public class Enemy {

    private int hitPoints;
    private int lives;

    public Enemy(int hitPoints, int lives){
        this.hitPoints = hitPoints;
        this.lives = lives;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void takeDamage(int damage){
        int remainingHitPoints = getHitPoints() - damage;
        setHitPoints(remainingHitPoints);
        System.out.println("Enemy took "+damage+" dmg and has "+getHitPoints()+" left");
    }
}
