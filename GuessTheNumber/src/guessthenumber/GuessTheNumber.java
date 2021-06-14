/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessthenumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author FRANCIS
 */
public class GuessTheNumber {

    int theNUMBER;
    int max;
    Scanner scanner = new Scanner(System.in);

    public GuessTheNumber() {
        Random rand = new Random();
        max = 100;  
        theNUMBER = Math.abs(rand.nextInt()) % (max + 1);
    }

    public void play() {
        while (true) {
            int move = scanner.nextInt();
            if (move > theNUMBER) {
                System.out.println("Your Number is big");
            } else if (move < theNUMBER) {
                System.out.println("The number is small");
            } else {
                System.out.println("You got it bro!");
                break;
            }
        }

    }

    public static void howBigIsMyNumber(int x) {

        if (x >= 0 && x <= 10) {
            System.out.println("That number is small");
        } else if (x >= 11 && x <= 100) {
            System.out.println("That number is big");
        } else {
            System.out.println("That number is out of range");
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here

        GuessTheNumber guessGame = new GuessTheNumber();
        System.out.println("Guess the number between 1 -" + guessGame.max);
        guessGame.play();

    }

}
