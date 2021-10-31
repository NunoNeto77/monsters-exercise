package com.company;

public class Mummy extends Monster{

    private final int UNROLL_DAMAGE = 5;
    private int hits;
    MonsterType monsterType;

    public Mummy(String name) {
       super(name, MonsterType.MUMMY);
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

/* package com.company;

public class Mummy extends Monster{
    private final int UNROLL_DAMAGE = 5;
    private int hits;
    private String name = "Mummy";
    private MonsterType monsterType;

    public Mummy(MonsterType monsterType) {
        super(MonsterType.MUMMY);
        this.hits = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    public int attack() {
        hits++;

        if (hits == 3) {
            setHealth(getHealth() - UNROLL_DAMAGE);
            hits=0;
            return 0;
        }
        return super.attack();
    }


} */
