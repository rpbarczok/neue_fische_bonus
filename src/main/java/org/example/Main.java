package org.example;

//Schreibe ein Programm, das den Namen des Nutzers einliest (Scanner) und ihn mit Namen begrüßt.

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(romanNumber(i));
        }
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

    public static String[] stringToArray (String str) {
        return str.split(",");
    }

    public static int quersumme (int number) {
        if  (number > 0) {
            number = Math.abs(number);
        }
        if (number < 10) {
            return number;
        }
        String numberString = String.valueOf(number);
        String[] numberStringArray =  numberString.split("");
        int sum = 0;
        for (String str : numberStringArray) {
            sum = sum + Integer.parseInt(str);
        }
        return sum;
    }

    public static String romanNumber (int number) {
        if (number > 100 || number < 1) {
            return "Gib eine Zahl zwischen 1 und 100 an!";
        }
        if (number == 100) {
            return "C";
        }
        int tens = number / 10;
        int ones = number % 10;
        return (romanNumberTens(tens)) + (romanNumberOnes(ones));
    }

    public static String romanNumberOnes(int number) {
        return switch(number) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            default -> "";
        };
    }

    public static String romanNumberTens(int number) {
        return switch(number) {
            case 1 -> "X";
            case 2 -> "XX";
            case 3 -> "XXX";
            case 4 -> "XL";
            case 5 -> "L";
            case 6 -> "LX";
            case 7 -> "LXX";
            case 8 -> "LXXX";
            case 9 -> "XC";
            default -> "";
        };
    }
}
