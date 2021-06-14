/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countdigits;

/**
 *
 * @author FRANCIS
 */
public class CountDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n = 25;
       int d = 11;       
       int count = 0;
        char digit =(char)(d +'0');    
        for(int i=0;i<=n;i++) {
          int k = i * i;
          String string = Integer.toString(k);
          for (int j=0; j < string.length(); j++) {
           // if (string.charAt(j) == digit) {
           //  count++;
          //   }
          System.out.println(string.charAt(j));
          }
        }
    }
    
}
