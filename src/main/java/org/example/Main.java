package org.example;

import java.util.Arrays;
import java.util.Scanner;

//Schreibe ein Programm, das den Namen des Nutzers einliest (Scanner) und ihn mit Namen begrüßt.

public class Main {
    public static void main(String[] args) {
        int[] numbers = {6,2,8,3,9,6};
        sortArray(numbers);
        System.out.println(Arrays.toString(sortArray(numbers)));
    }

    public static String reverseString(String str){
        StringBuilder strReverse = new StringBuilder(str);
        return strReverse.reverse().toString();
    }

    public static int[] sortArray (int[] array) {
        int[] sortedArray = array.clone();
        int j=0;
        while (j < array.length-2) {
            j = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if  (array[i] > array[i + 1]) {
                    sortedArray[i] = array[i + 1];
                    sortedArray[i + 1] = array[i];
                } else {
                    System.out.println();
                    j++;
                }
            }
            array=sortedArray.clone();
        }
        return sortedArray;
    }



}
