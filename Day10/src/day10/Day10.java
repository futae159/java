/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day10;

import java.util.Scanner;

/**
 *
 * @author FRANCIS
 */
public class Day10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binary = Integer.toBinaryString(n);
        int one = 0;
        int tempOne = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                tempOne++;
                System.out.println("pumasok dito");
            } else {
                if (tempOne > one) {
                    one = tempOne;
                }
                tempOne = 0;
                System.out.println("nandito");
            }
        }
        if (tempOne > one) {
            one = tempOne;
        }
        System.out.println(one);

        //   for (int i = 0; i < tc; i++) {
        //      int n = sc.nextInt();
        //      System.out.println(Integer.toBinaryString(n));
        //  }
    }
}
