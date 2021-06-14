/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Arrays;

/**
 *
 * @author FRANCIS
 */
public class ATM {

    public static void SongDecoder(String song) {
        String newString = song;
        
        while (newString.contains("WUBWUB")) {
        newString = newString.replaceAll("WUBWUB", "WUB");
        }
        
        newString = newString.replaceAll("WUB", " ");

        while (newString.charAt(0) == ' ') {
            newString = newString.replaceFirst(" ", "");
        }
        if (newString.charAt(newString.length() - 1) == ' ') {
                System.out.println("pumasok dito");
                newString = newString.substring(0, newString.length() - 1);
            }
        System.out.println("x" + newString + "x");
    }

    public static void main(String[] args) {
        SongDecoder("WUBWUBRASDWUBWUBWUBSWUBWUBWUBWUB");
    }

}
