package com.company;

public class Boss {
    private int health;
    private int power;
    private int defense;
    public Boss () {}
        public Boss (int health, int power, int d) {
        this.health = health;
        this.power = power;
        this.defense = d;
        }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
