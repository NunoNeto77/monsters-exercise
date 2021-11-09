package com.company;

public abstract class SuperNatural {

    private String name;
    private int hitPower;
    private int health;

    public SuperNatural(String name, int hitPower) {
        this.name = name;
        this.hitPower = hitPower;
        this.health = 50;
    }

    public int attack() {
        return hitPower;
    }


    public boolean isAlive() {
        return getHealth() > 0;
    }




    public void printMonster() {
        System.out.print(name + " (health: " + getHealth() + " | hit power: " + hitPower + ")\n");
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return health;
    }

    public int getHitPower() {
        return this.hitPower;
    }

    public void setHealth(int health) {
        this.health = health;
    }


}
