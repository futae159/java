/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeatstring;

/**
 *
 * @author FRANCIS
 */
public class RepeatString {

    public static String repeatStr(final int repeat, final String string) {

        StringBuilder newString = new StringBuilder(string);
        if (repeat == 0) {
            return "";
        } else {
            for (int i = 1; i < repeat; i++) {
                newString.append(string);
            }
        }
        System.out.println(newString);
        return newString.toString();
    }

    public static void main(String[] args) {
        repeatStr(4, "a");
    }

}
