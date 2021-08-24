/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package main.java.Insertion.Sort;

import java.util.Arrays;

public class Library {
    public static void main(String[] args) {
        int[] arr = {8,4,23,42,16,15};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void InsertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int j = i-1;
            int temp = arr[i];
            while (j >= 0 && temp < arr[j]) {
                arr[j+1]= arr[j];
                j = j-1;
            }
            arr[j+1] =temp;

        }
    }

}