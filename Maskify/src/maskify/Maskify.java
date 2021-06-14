/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maskify;

/**
 *
 * @author FRANCIS
 */
public class Maskify {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String str = "4556364607935616";
        StringBuilder myName = new StringBuilder(str);
        for (int i = 0; i < str.length() - 4; i++) {
            myName.setCharAt(i, '#');
        }
        System.out.println(myName.toString());
    }
}
