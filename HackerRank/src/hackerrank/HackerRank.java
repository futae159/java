/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author FRANCIS
 */
public class HackerRank {

    public static void mathLoop() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        //for T
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int N = sc.nextInt();
            for (int j = 0; j < N; j++) {
                int term = a;
                int counter = j;
                while (counter >= 0) {
                    term += (Math.pow(2, counter) * b);
                    counter--;
                }
                System.out.print(term + " ");
            }
            System.out.println("");
        }

    }

    public static void testLoop() {
        int a = 5, b = 3, N = 5, ans;
        for (int x = 0; x <= N; x++) {
            int number = 2,p = x;
            long result = 1;
            int term = a;
            int i = p;
            while (i != 0) {
                result *= number;
                --i;
             term += result * b;
            }
    
           // ans = (int) (result * b);
           System.out.print(term);
        }
        
    }

    //TEST TEST TEST TEST TEST
    public static void testLoop2() {
        int T = 1;
    
       for (int i = 0; i < T; i++) {
       int  a = 5, b = 3, N = 5;
       for (int j=0; j<N; j++){
           int term = a;
           int counter = j;
           while(counter>=0){
               term+=(Math.pow(2,counter)*b);
               counter--;
           }
           System.out.print(term+" ");
       }
       System.out.print("\r");
   }
}
    


    public static void main(String[] args) {
        mathLoop();
    }

}
