package com.rishabh.javabasicsexercise1;

public class ReverseArray {
    public static void printArray(int[] array){
        System.out.println("Array: ");
        for(int a: array){
            System.out.print(a+", ");
        }
        System.out.println();
        reverseArray(array);
    }


    // Exercise 6
    public static void reverseArray(int[] array){
        System.out.println("Inverted array: ");
        for(int i=array.length-1;i>=0;i--){
            System.out.format("%d, ", array[i]);
        }
        System.out.println();
        printSquareOfArray(array);
    }

    public static void printSquareOfArray(int[] array){
        System.out.println("Squared array: ");
        for(int a: array){
            System.out.print((a*a)+", ");
        }
    }

    public static void main(String[] args) {
        int[] array = {2,4,6,1,2,5,7,8,9,20};
        printArray(array);
    }


}
