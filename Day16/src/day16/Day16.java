/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day16;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author FRANCIS
 */
public class Day16 {

    static void minimumAbsoluteDifference(int[] arr) {
        
        int minimum = Integer.MAX_VALUE;
        Arrays.sort(arr);
        int firstElement = arr[0];

        int secondElement = arr[1];

        for (int i = 2; i < arr.length; i++) 
            if (Math.abs(arr[i] - arr[i - 1]) < minimum) {
                minimum = Math.abs(arr[i] - arr[i - 1]);

                firstElement = arr[i - 1];

                secondElement = arr[i];
                System.out.print(firstElement + " " + secondElement+" ");
            }

        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        

        minimumAbsoluteDifference(arr);

    }

}
