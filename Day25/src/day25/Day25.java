/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day25;

import java.util.Arrays;
import java.util.Scanner;

public class Day25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[T];
        for (int i = 0; i < arr.length; i++) {
            if (primeNumbers(sc.nextInt())) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        } 
    }

    private static boolean primeNumbers(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
