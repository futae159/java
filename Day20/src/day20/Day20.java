/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day20;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author FRANCIS
 */
public class Day20 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();  
        String newS = S.replaceAll("[^a-zA-Z0-9]", " ");
                
        StringTokenizer st = new StringTokenizer(newS);
        int count = st.countTokens();
        System.out.println(count);
              
        while (st.hasMoreTokens()) {                     
                System.out.println(st.nextToken());
            
        }

    }

}
