package main.quickSort;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int[] quickSortArr = {6, 80, 1, 5, 20, 18};

        quickSort(quickSortArr,0,5);
        System.out.println("Quick sort" + Arrays.toString(quickSortArr));
    }

    public static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            int  pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public static int partition(int[] arr, int low, int high)
    {

        int pivot = arr[high];

        int i = (low - 1);

        for(int j = low; j <= high - 1; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
