/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

import java.util.Scanner;

/**
 *
 * @author FRANCIS
 */
public class Solution {

    public static void test1() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;

        while (i <= n) {
            System.out.print(" ");
            i++;
            if (i == n) {
                int t = n;
                while (t > 0) {
                    System.out.print("#");
                    t--;
                }
                System.out.println("");

            }

        }

    }
    
    public static void test2() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = n;
        while(n > t)
                while (t > 0) {
                    System.out.print("#");
                    t--;
                }
                
        
    }
    
    public static void test3() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = 1;
        int b = 1;
        int i = n;

        for (int u = 0; u < n; u++) {
            
            
            
            
            
            
            
            
            
            
            
            
            
            while (i > 1) {
                System.out.print(" ");
                i--;
            }
            while (t > 0) {
                System.out.print("#");
                t--;
            }
            System.out.println("");
            t = b + 1;
            i = n - b;
            b++;
        }

    }

    public static void main(String[] args) {
        test3();
    }

}
