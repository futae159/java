/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author FRANCIS
 */
public class Day7 {

    public static void test1() {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        
        for (int x = N - 1; x >= 0; x--){
            System.out.print(Array.get(arr, x) + " ");
        }
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
        test1();
    }

}
