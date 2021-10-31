package com.company;

public abstract class Monster {

    private String name;
    MonsterType monsterType;
    private int health;

    public Monster(String name, MonsterType monsterType) {
        this.name = name;
        this.monsterType = monsterType;
        this.health = 100;

        }

        public abstract int attack();

        public abstract void defend(int damage);

        public abstract boolean isAlive();



    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void printMonster() {
        System.out.print(getName() + " (health: " + getHealth() + " | hit power: " + monsterType.getHitPower() + ")\n");
    }
}


