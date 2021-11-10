package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Game {

    Player player1 = new Player("joão");
    Player player2 = new Player("gon");



    private int round = 0;
    private SuperNatural obstacle;


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

        boolean isObstacleCreated = createObstacles();

        if (isObstacleCreated) {
            obstacleMove();
        }
            else {
                normalRound(player1, player2);
        }

        player1.removeDeadMonster(player1);
        player2.removeDeadMonster(player2);

        player1.printMonsters(player1.getMonsters());
        player2.printMonsters(player2.getMonsters());
    }

    public boolean createObstacles() {
        int random = (int) (Math.floor(Math.random() * 6));

        if (random == 2) {
            System.out.println("A Fairy was created!");
            obstacle = new Fairy();
            return true;

        }   else if (random == 5) {
                System.out.println("A Witch was created!");
                obstacle = new Witch();
                return true;

        } else {
            return false;
        }
    }


    public void normalRound(Player player1, Player player2) {
        int random = (int) (Math.floor(Math.random() * 2));

        if (random == 0) {
            System.out.println(player1.getNickname() + " will attack!");
            defender(player2, player1);

        } else {
            System.out.println(player2.getNickname() + " will attack!");
            defender(player1, player2);
        }
    }


    public void defender(Player defender, Player attacker) {
        int monsterDefending = (int) (Math.random() * defender.getMonsters().length);
        int monsterAttacking = (int) (Math.random() * attacker.getMonsters().length);

        System.out.println(attacker.getMonsters()[monsterAttacking].getName() + " is attacking\n");
        System.out.println(defender.getMonsters()[monsterDefending].getName() + " is suffering the attack");

        defender.getMonsters()[monsterDefending].defend(attacker.getMonsters()[monsterAttacking].attack());

    }


    public void obstacleMove() {  // if the obstacles will attack or defend
        int random = (int) (Math.floor(Math.random() * 2));

        int player1Monster = (int) (Math.random() * player1.getMonsters().length);
        int player2Monster = (int) (Math.random() * player2.getMonsters().length);

        if (random == 0) {    // obstacles will attack
            System.out.println("The " + obstacle.getName() + " will attack both players!");

            System.out.println(player1.getMonsters()[player1Monster].getName() + " will be attacked (player 1)");
            System.out.println(player2.getMonsters()[player2Monster].getName() + " will be attacked (player 2)");

            player1.getMonsters()[player1Monster].defend(obstacle.getHitPower());
            player2.getMonsters()[player2Monster].defend(obstacle.getHitPower());
        }

            else {   //obstacles will be attacked
                if (obstacle instanceof Fairy) {
                    System.out.println("You can't attack a Fairy!");
                }
                    else {
                        ((Witch) obstacle).defend(player1.getMonsters()[player1Monster].getHitPower() + player2.getMonsters()[player2Monster].getHitPower());
                }

            }

        }


    public void winner() {
        if (player1.getMonsters().length > player2.getMonsters().length) {
            System.out.println(player1.getNickname() + " won the game!");
        } else {
            System.out.println(player2.getNickname() + " won the game!");
        }

    }

   
}

