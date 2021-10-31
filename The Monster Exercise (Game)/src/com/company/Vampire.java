package com.company;

public class Vampire extends Monster{

    private final double BITING_CHANCE = 0.2; // 20% de possibilidade de morder
    private final int HEALING_RATE = 10;
    MonsterType monsterType;

    public Vampire(String name) {
        super(name, MonsterType.VAMPIRE);
    }

    @Override
    public int attack() {
        if (Math.random() < BITING_CHANCE) {
            if (getHealth() + HEALING_RATE > 100) {
                setHealth(100);
                return this.monsterType.getHitPower();
            }
            setHealth(getHealth() + HEALING_RATE);
        }
        return this.monsterType.getHitPower();
    }

    @Override
    public void defend(int damage) {
        setHealth(getHealth() - damage);

        if (getHealth() < 0) {
            setHealth(0);
        }

        getHealth();
    }

    public boolean isAlive() {
        return getHealth() > 0;
    }
}
