/*
Marcos Mateus
10/26/20
This program will roll a dice for you and for computer.
JDK Version 1.8
 */


import java.util.Scanner;
public class DiceRoll {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("How many times would you like to roll the dice?");
        int times=input.nextInt();
        int winCounter= 0;
        int lossCounter=0;
        int tieCounter=0;
        String result=null;
        for (int i = 0; i < times; i++){
        int die1 = (int) (6*Math.random()+1);
        int die2 = (int) (6*Math.random()+1);
        System.out.println("User rolls: " + die1 + " Computer rolls: " 
        + die2);
        
        if (die1 > die2) {
            System.out.println("You win.");
            winCounter++;
        } else if (die1 < die2) {
            System.out.println("You lose.");
            lossCounter++;
        } else {
            System.out.println("You tie.");
            tieCounter++;
        }
    }
        System.out.println("Total Wins: " + winCounter);
        System.out.println("Total Losses: " + lossCounter);
        System.out.println("Total Ties: " + tieCounter);
    }
}