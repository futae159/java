/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicearray2;

import java.util.Arrays;

/**
 *
 * @author FRANCIS
 */
public class PracticeArray2 {

    /*Bubble Sort!!
    *
    *
    */
    public static void main(String[] args) {
        
        int[] arr = {10, 15, 69, 420, 54, 11, 8, 7, 63, 45, 58,654,987987,321,321,4654,6548,7987987,1,2,3,4,5,79879,1321,6548,4230,887,25454};
        
        int N = arr.length;
        int temp;
        
        for (int i=0; i < N-1;i++){
            for (int j=0; j<N-i-1;j++) {
                if (arr[j] > arr[j +1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        System.out.println(Arrays.toString(arr));

    }
}
