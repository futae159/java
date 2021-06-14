/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;
//class FindOdd {
//	public static int findIt(int[] a) {

import java.util.Arrays;

//        int[] b = {2,3,4,5,6,7,8,90,0,0,2,1,4,1,2,3,4,5,6,7};
//       for (int c: b) {
//            if (c % 2 != 0) {
//               System.out.println(c);
////            }
//       }
//return odd;
//  }
//}
public class Codewars {

     public static String Tickets(int[] peopleInLine)
  {
   int money = 0;
    int price = 25;
    int change = 0;
    int peopleMoney = 0;
    for(int i = 0; i < peopleInLine.length;i++) {
      peopleInLine[i] = peopleMoney;
      money += 25;
      peopleMoney - price;
      change = peopleInLine[i];
       if (money < change) {
         return "NO";    
      
    }
    if (money < 0) {
         return "NO";
      } else {
        return "YES";
      }
    
  }
    public static void main(String[] args) {
        int[] b = {2, 3, 4, 5, 6, 7, 8, 90, 0, 0, 2, 1, 4, 1, 2, 3, 4, 5, 6, 7};
        int[] newArr = new int[b.length];
        int cnt = 0;
        int cnt2 = 0;
        int odd = 0;
        
        

        for (int c : b) {
            if (c % 2 != 0) {
                c = newArr[cnt];
                cnt++;
            }
        }
         Arrays.sort(newArr);
         for (int i = 0; i < newArr.length;i++) {
            if (newArr[i] == cnt2) {
                odd = newArr[i];
                cnt2++;
            }

        }
         
      

    }

}
