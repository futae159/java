/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accumul;

public class Accumul {

    public static String accum(String s) {
        // your code
        String stringLower = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        int test = s.length();
        for (int i = 1; i <= test; i++) {
            char letter = stringLower.charAt(i-1);
            sb.append(Character.toUpperCase(letter));
            for (int j = 1; j < i; j++) {
             // if(sb.charAt() == '-') {
              // sb.append(Character.toUpperCase(letter));
              // } else {
                   sb.append(letter);
              // }
            }
            sb.append('-');
           
        }
        sb.deleteCharAt(sb.length()-1);
      //  System.out.println(sb.toString());
       
        return sb.toString();
    }
        /**
         * @param args the command line arguments
         */
    public static void main(String[] args) {
        accum("ZpglnRxqenU");
    }

}

