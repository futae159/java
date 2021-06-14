package day9hackerrank;

import java.io.*;
import java.util.*;

public class Day9HackerRank {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //Take Input
        String[] arrItems = sc.nextLine().split(" ");
       // sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] arr = new int[2];

        for (int i = 0; i < 2; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        int a = arr[0];
        int b = arr[1];
        

        int gcd = find_gcd(a, b);
        System.out.println(gcd);
    }

    static int find_gcd(int a, int b) {
        //Write the base condition

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        // At this point, GCD(K,M) = GCD(k,m) = GCD(k,k) = k
        return a ;
    }
}
