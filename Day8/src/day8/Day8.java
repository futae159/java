/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author FRANCIS
 */
public class Day8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, String> phoneBook = new HashMap<String, String>();

        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int N = in.nextInt();
            in.nextLine();

            for (int i = 0; i < N; i++) {
                String name = in.nextLine();
                String phone = in.nextLine();
                //in.nextLine();
                phoneBook.put(name, phone);
            }
            
            while (in.hasNext()) {
                String s = in.nextLine();
                if (phoneBook.containsKey(s)) {
                    System.out.println(s + "=" + phoneBook.get(s));
                } else {
                    System.out.println("Not found");
                }
            }
        } else {
            System.out.println("BOBO");
            return;

        }

    }

}
