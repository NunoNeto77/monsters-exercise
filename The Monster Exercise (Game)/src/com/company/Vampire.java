package com.company;

public class Vampire extends Monster{

    private final double BITING_CHANCE = 0.2; // 20% de possibilidade de morder
    private final int HEALING_RATE = 10;

    public Vampire() {
        super(MonsterType.VAMPIRE);
    }

    @Override
    public int attack() {
        if (Math.random() < BITING_CHANCE) {
            if (getHealth() + HEALING_RATE > 100) {
                setHealth(100);
                return getHitPower();
            }
            setHealth(getHealth() + HEALING_RATE);
        }
       // return getHitPower();
        return super.getHitPower();
    }

}
