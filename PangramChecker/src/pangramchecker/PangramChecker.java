/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pangramchecker;

/**
 *
 * @author FRANCIS
 */
public class PangramChecker {

    public boolean check(String sentence) {
        sentence = sentence.toLowerCase();
        boolean isPangram = true;
        for (char c = 'a'; c <= 'z'; ++c) {
            if (!sentence.contains(String.valueOf(c))) {
                isPangram = false;
                break;
            }
        }
        if (isPangram == true) {
            return true;
        }
        return isPangram;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
