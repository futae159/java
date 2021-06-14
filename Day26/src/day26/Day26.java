/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day26;

import java.util.Scanner;

/**
 *
 * @author FRANCIS
 */
public class Day26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] actualDate = sc.nextLine().split(" ", 3);
        String[] deadline = sc.nextLine().split(" ", 3);
        

        int[] intActualDate = new int[actualDate.length];
        int[] intDeadline = new int[deadline.length];

        for (int i = 0; i < actualDate.length; i++) {
            intActualDate[i] = Integer.parseInt(actualDate[i]);
        }

        for (int j = 0; j < deadline.length; j++) {
            intDeadline[j] = Integer.parseInt(deadline[j]);
        }

        if (intActualDate[2] > intDeadline[2]) {
            System.out.println("10000");
        } else if (intActualDate[1] > intDeadline[1] && intActualDate[2] == intDeadline[2]) {
            System.out.println((intActualDate[1] - intDeadline[1]) * 500);
        } else if (intActualDate[0] > intDeadline[0] && intActualDate[1] == intDeadline[1]) {
            System.out.println((intActualDate[0] - intDeadline[0]) * 15);
        } else {
            System.out.println("0");
        }

    }

}
