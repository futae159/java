/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day14;

import java.util.Arrays;
import java.util.Scanner;

class Difference {

    private int[] elements;
    public int maximumDifference;

    Difference(int[] a) {
        elements = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            elements[i] = a[i];
        }
    }

    public void computeDifference() {
        Arrays.sort(elements);
        maximumDifference = elements[elements.length - 1] - elements[0];
    }

}

public class Day14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        Difference D = new Difference(a);

        D.computeDifference();

        System.out.print(D.maximumDifference);
    }

}
