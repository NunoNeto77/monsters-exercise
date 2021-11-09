package com.company;

public enum MonsterType {
    WEREWOLF("Werewolf", 15),
    VAMPIRE("Vampire",10),
    MUMMY("Mummy", 8);


private String name;
private int hitPower;

   private MonsterType (String name, int hitPower) {
       this.name = name;
       this.hitPower = hitPower;
   }

    public int getHitPower() {
        return this.hitPower;
    }

}
