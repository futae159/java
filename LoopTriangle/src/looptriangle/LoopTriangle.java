/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looptriangle;

import java.util.Scanner;

/**
 *
 * @author FRANCIS
 */
public class LoopTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String ast = "*";
        for (int i = 0; i < T; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ast);
            }
            System.out.println();
        }
    }

}
