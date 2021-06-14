/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day27;

import java.util.Scanner;

/**
 *
 * @author FRANCIS
 */
public class Day27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s[] = sc.nextLine().split(" ");
        String x[] = sc.nextLine().split(" ");
        int[] NK = new int[2];
        int[] TM = new int[x.length];

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < s.length; j++) {
                NK[j] = Integer.parseInt(s[j]);
            }
             for (int k = 0; k < x.length; k++) {
                TM[k] = Integer.parseInt(x[k]);
            }
            int N = NK[0];
            int K = NK[1];
            //int[] arr = new int[];
            for (int k = 0; k < N; k++) {

            }

        }

    }

}
