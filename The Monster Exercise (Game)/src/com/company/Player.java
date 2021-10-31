package com.company;

public class Player {

    private String nickname;
    private Monster[] monsters;

    public Player(String nickname) {
        this.nickname = nickname;
    }

    public void monstersPlayer(int numberOfMonsters) {
        System.out.println(getNickname() + ":");

         this.monsters = new Monster[numberOfMonsters];

        for (int i = 0; i < this.monsters.length; i++) {
            int random = (int) (Math.floor(Math.random() * 3));

            switch (random) {
                case 0:
                    this.monsters[i] = new Werewolf("Werewolf");
                    break;

                case 1:
                    this.monsters[i] = new Vampire("Vampire");
                    break;

                case 2:
                    this.monsters[i] = new Mummy("Mummy");
                    break;

            }
            monsters[i].printMonster();
        }
        System.out.println("------------------");
        System.out.println("");


    }



        public void printMonsters(Monster[] monsters) {
            for (int i = 0; i < monsters.length; i++) {
                monsters[i].printMonster();
            }
        }



    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


    public Monster[] getMonsters() {
       return this.monsters;
    }



    public void setMonsters(Monster[] monsters) {
        this.monsters = monsters;
    }
}
