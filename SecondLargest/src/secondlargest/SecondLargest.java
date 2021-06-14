/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondlargest;

import java.util.Arrays;

/**
 *
 * @author FRANCIS
 */
public class SecondLargest {

    public static void getSecondLargest() {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int largest = 0;
        int secondLargest = 0;
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
                secondLargest = nums[i-1];
            } 

        }
        System.out.println(Arrays.toString(nums));
        System.out.println(secondLargest);

    }

    public static void main(String[] args) {

        getSecondLargest();
    }

}
