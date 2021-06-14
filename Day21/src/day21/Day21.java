/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day21;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 *
 * @author FRANCIS
 */
class Printer {
     public static <D> void printArray(D[] arr) {
      //  for (D element : arr) {
            for(int i = 0; i < arr.length;i++) {
            System.out.println(arr[i]);
            }
     //  }
         
     }

}

public class Day21 {

    public static void main(String args[]) {
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;
        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();
            if (name.equals("printArray")) {
                count++;
            }
        }

        if (count > 1) {
            System.out.println("Method overloading is not allowed!");
        }
        assert count == 1;

    }
}
