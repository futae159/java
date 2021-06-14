/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twosums;

import java.util.Arrays;

/**
 *
 * @author FRANCIS
 */
public class TwoSums {

    public static void main(String[] args) {
       int target = 4;
       int[] nums = {1,2,3};
       int[] newArr = new int[2];
        for(int i=target-5;i< target+5;i++) {
             for(int j=0;j<nums.length;j++) {                 
                 if(nums[i] + nums[j] == target) {
                  newArr[0] = j;
                  newArr[1] = i;
                  System.out.println(Arrays.toString(newArr));
                  Arrays.sort(newArr);
                  String x = Integer.toString(target);
                  if(x.contains("1")) {
                      
                  }
                 }

             }
        }
       
    }
    
}
