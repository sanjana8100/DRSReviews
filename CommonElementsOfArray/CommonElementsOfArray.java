package com.bridgelabz.CommonElementsOfArray;

import java.util.Arrays;

public class CommonElementsOfArray {
    public static void printCommonElements(int[] array1, int[] array2){
        System.out.println("The Common Elements of Two Arrays are: ");

        for (int i=0 ; i<array1.length ; i++){
            for (int j=0 ; j<array2.length ; j++){
                if (array1[i] == array2[j]){
                    System.out.println(array1[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array1 = {1,2,6,7,9,12};
        int[] array2 = {1,0,5,15,7,3,11};

        System.out.println("Array 1: "+ Arrays.toString(array1));
        System.out.println("Array 2: "+ Arrays.toString(array2));

        printCommonElements(array1,array2);
    }
}
