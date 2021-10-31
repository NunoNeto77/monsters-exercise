package com.company;
import java.util.Scanner;

public class Game {

    Player player1 = new Player("joão");
    Player player2 = new Player("gon");

    private int round = 0;
 //   boolean quit = false;

    public void start() {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("How many monsters do you want? YOUR CLOWNNNNSS");
        int numberOfMonsters = input.nextInt();

        // To create an array of MONSTERS
        this.player1.monstersPlayer(numberOfMonsters);
        this.player2.monstersPlayer(numberOfMonsters);

        while (player1.getMonsters().length != 0 && player2.getMonsters().length != 0) {
            rounds();
        }
        winner();

    }

    public void rounds() {
        round++;
        System.out.println("     Round " + round + "\n     FIGHT!");

        chooseAttacker(this.player1, this.player2);
        removeDeadMonster(player1);
        removeDeadMonster(player2);

        player1.printMonsters(player1.getMonsters());
        player2.printMonsters(player2.getMonsters());
    }


     public void chooseAttacker(Player player1, Player player2) {
         int random = (int) (Math.floor(Math.random() * 2));

         if (random == 0) {
             System.out.println(player1.getNickname() + " will attack!");
             defender(player2, player1);

         }
         else {
             System.out.println(player2.getNickname() + " will attack!");
             defender(player1, player2);
         }
     }


     public void defender(Player defender, Player attacker ) {
        int monsterDefending = (int) (Math.random() * defender.getMonsters().length);
        int monsterAttacking = (int) (Math.random() * attacker.getMonsters().length);

        System.out.println(attacker.getMonsters()[monsterAttacking].getName() + " is attacking\n");
        System.out.println(defender.getMonsters()[monsterDefending].getName() + " is suffering the attack");

        defender.getMonsters()[monsterDefending].defend(attacker.getMonsters()[monsterAttacking].attack());

        }


    public void winner() {
        if (player1.getMonsters().length > player2.getMonsters().length) {
            System.out.println(player1.getNickname() + " won the game!");
        }
            else {
                 System.out.println(player2.getNickname() + " won the game!");
        }

    }

    public Monster[] removeDeadMonster(Player player) {
        Monster[] tempMonster = new Monster[player.getMonsters().length - 1];
        int j = 0;
        for (int i = 0; i < player.getMonsters().length; i++) {
            if (player.getMonsters()[i].isAlive()) {
                tempMonster[j] = player.getMonsters()[i];
                j++;
            }
        }
        player.setMonsters(tempMonster);
        return player.getMonsters();

    }



}

/*
  public void checkGameContinue(Player player) {
    if (player.monsters.length == 0) {
             System.out.println(player.getNickname() + " you lost the game!\n");
             winner();
     }
         else {
             System.out.println(player.monsters);
             rounds();
         }
    }
   */