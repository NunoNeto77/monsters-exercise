package com.company;

public enum MonsterType {
    WEREWOLF(15),
    VAMPIRE(10),
    MUMMY(8);

    private int hitPower;

   private MonsterType (int hitPower) {
       this.hitPower = hitPower;
   }

    public int getHitPower() {
        return this.hitPower;
    }

}
