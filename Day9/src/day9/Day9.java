/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9;

import java.util.Scanner;

/**
 *
 * @author FRANCIS
 */
public class Day9 {

    
    public static int Factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            
            return n * Factorial(n-1);
            
        }
    }
    
  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);       
        int n = sc.nextInt();       
        System.out.println(Factorial(n));
    }
    
}
