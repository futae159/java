/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversedstring;

/**
 *
 * @author FRANCIS
 */
public class ReversedString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "Hello";
        
        
        for (int i = str.length() - 1; i >= 0;i--) {
           System.out.print(str.charAt(i));
        }
        
    }
    
}
