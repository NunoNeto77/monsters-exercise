package com.company;

public class Mummy extends Monster{

    private final int UNROLL_DAMAGE = 5;
    private int hits;


    public Mummy() {
       super(MonsterType.MUMMY);
       this.hits = 0;
    }

    @Override
    public int attack() {
        hits++;
        if (hits == 3) {
            System.out.println("The attack will be canceled and the mummy will lose health");
            setHealth(getHealth() - UNROLL_DAMAGE);
            hits = 0;
            return 0;
        }
      //  return getHitPower();
        return super.getHitPower();
    }


}

