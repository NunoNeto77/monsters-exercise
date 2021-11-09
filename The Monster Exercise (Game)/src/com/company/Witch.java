package com.company;

public class Witch extends SuperNatural implements Strikeable {

    public Witch() {
        super("Witch", 20);

    }

    public void defend(int damage) {
        setHealth(getHealth() - ( damage / 2));

        if (getHealth() < 0) {
            setHealth(0);
        }
    }
}
