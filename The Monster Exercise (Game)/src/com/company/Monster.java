package com.company;

import java.lang.reflect.Type;

public abstract class Monster extends SuperNatural implements Strikeable {

    MonsterType type;
    //  private boolean dead;

    public Monster(MonsterType type) {
        super(type.name(), type.getHitPower());
        this.type = type;
    }

    public void defend(int damage) {
        setHealth(getHealth() - damage);

        if (getHealth() < 0) {
            setHealth(0);
        }
    }
}


