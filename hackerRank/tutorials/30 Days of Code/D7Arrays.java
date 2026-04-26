package hackerRank.tutorials.30 Days of Code;

public class D7Arrays {
    
}

//TUTORIAL by BlondieBytes thank you!
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraypractice;

import java.util.Arrays;

/**
 *
 * @author corn
 */
public class ArrayPractice {
    
    public static void printArray(int[] array) {
        System.out.print("[");
        for(int i = 0; i < array.length; i++) {
            int item = array[i];
            System.out.print(item);
            if(i< array.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    public static void printArray(String[] array) {
        System.out.print("[");
        for(int i = 0; i < array.length; i++) {
            String item = array[i];
            System.out.print(item);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        //index 0 1 2 3
        //array [0,6,4,3] length 4
        
        // 0     1      2
        // ["nyeaight", "trees", "door"] length 3
        int[] intArray1;
        int[] intArray2 = new int [4]; // size of the array
        printArray(intArray2);
        int[] intArray3 = {4,1,8,3,5};
        String[] shoppingList = {"apples", "pineapple", "blueberries"};
        intArray2[0] = 10;
        intArray2[1] = 8;
        intArray2[2] = 5;
        intArray2[3] = 10;
        
        // Print out arrays
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));
        System.out.println();
        //Custom print out arrays
        printArray(intArray2);
        printArray(intArray3);
        System.out.println();
        // Retrieve objects
        System.out.println(intArray2[3]);
        System.out.println();
        // Given function
        Arrays.sort(intArray3);
        printArray(intArray3);
        
        printArray(shoppingList);
        
        System.out.println("Special for loop");
        //Special for loop
        for (String s: shoppingList) {
            System.out.println(s);
        }
              
       }
}
