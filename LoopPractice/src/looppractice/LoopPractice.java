/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looppractice;

/**
 *
 * @author FRANCIS
 */
public class LoopPractice {

    public static void whileLoop() {
        int x = 0;
        while (x < 5) {
            System.out.println("The number is: " + x);
            x++;
        }
    }
    
    public static void doLoop() {
        int x = 0;
        do {
            System.out.println("The number is: " + x);
            x++;
        } while (x < 5);
    }
    
    public static void forLoop() {
        for(int x = 0; x < 3; x++) {
            System.out.println("The x is: " + x);
            for(int y = 0; y < 3; y++) {
                System.out.println("The y is: " + y);
            } 
        }
    }
    public static void main(String[] args) {
        
        forLoop();
    }
    
}
