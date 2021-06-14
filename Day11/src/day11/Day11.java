/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day11;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author FRANCIS
 */
public class Day11 {

    public static void test1() {
        Scanner in = new Scanner(System.in);
        int newArr[][] = new int[6][6];
        int total;
        for (int i = 0; i < 6; i++) {
            String str = in.nextLine();
            String arr[] = str.split(" ");
            for (int j = 0; j < 6; j++) {
                newArr[i][j] = Integer.parseInt(arr[j]);
            }
        }
        int max = newArr[0][0] + newArr[0][1] + newArr[0][2] + newArr[1][1]
                + newArr[2][0] + newArr[2][1] + newArr[2][2];
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                total = newArr[j][i] + newArr[j][i + 1] + newArr[j][i + 2]
                        + newArr[j + 1][i + 1] + newArr[j + 2][i] + newArr[j + 2][i + 1]
                        + newArr[j + 2][i + 2];
                if (max < total) {
                    max = total;
                }
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        //   Scanner in = new Scanner(System.in);
        //  String newArr[] = in.split(" ");
        //  int arr[][] = new int[6][6];
        //  for (int i = 0; i < 6; i++) {
        //      for (int j = 0; j < 6; j++) {
        //          newArr[] = in.nextLine();
        //          arr[i][j] = Integer.parseInt(newArr[j]);
        //     }
        // }
        // System.out.println(Arrays.toString(arr));
        test1();

    }
}
