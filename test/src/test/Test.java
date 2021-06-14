/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author FRANCIS
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void test() {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
 /* Read and save an integer, double, and String to your variables.*/
        int num1 = scan.nextInt();
        double num2 = scan.nextDouble();
        scan.nextLine();
        String x = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + num1);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d + num2);

        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + x);

        scan.close();
    }

    public static void test2() {
        double d = 4.0;
        Scanner scan = new Scanner(System.in);
        double num2 = scan.nextDouble();
        double num1 = scan.nextDouble();

        double num3 = num1 + num2;
        System.out.println(num3);

    }

    public static void main(String[] args) {
        test();

    }

}
