package com.company;

public class Werewolf extends Monster{

    MonsterType monsterType;

    public Werewolf(String name) {
        super(name, MonsterType.WEREWOLF);
    }

    public int attack() {
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

