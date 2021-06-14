/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package growth.of.population;

class Arge {
    
    
}
public class GrowthOfPopulation {
    public static int nbYear(int p0, double percent, int aug, int p) {
        
        int n = 0;
        int ans = 0;

        for(int i = 0; ans <=p;i++) {
            ans = (int) (p0  + (p0 * (percent/100))) + aug;
            p0 = ans;
            n++;
        }
        
     
        
        System.out.println(n);
        return p0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        nbYear(1500000, 2.5, 10000, 2000000);
    }
    
}
