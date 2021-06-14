
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author FRANCIS
 */
public class test5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        String string;

        for (int i = 0; i < tc; i++) {
            string = sc.next();

            for (int x = 0; x < string.length(); x += 2) {
                System.out.print(string.charAt(x));
            }
            System.out.print(" ");
            for (int x = 1; x < string.length(); x += 2) {

                System.out.print(string.charAt(x));

            }
            System.out.println();

        }

    }

}
