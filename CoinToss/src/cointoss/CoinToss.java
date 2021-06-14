/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cointoss;

import java.util.Random;

/**
 *
 * @author FRANCIS
 */
public class CoinToss {

    public int tossACoin() {
        Random rand = new Random();
        int toss = Math.abs(rand.nextInt()) % 2;
        return toss;      
    }
    
    public String coinAToss() {
        Random rand = new Random();
        int toss = Math.abs(rand.nextInt()) % 2;
        if(toss == 0) {
            return "Heads!";
        } else {
             return "Tails!";
        }
                 
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        CoinToss game = new CoinToss();
        System.out.println(game.coinAToss());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());            
    }
    
}
