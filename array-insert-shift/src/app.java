import java.util.Arrays;

public class app {
    public static void main(String[] args) {
        int n = 10;

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int x = 20;
        arr = addX(n, arr,x);
        System.out.println("\nArray with " + x
                + " added:\n"
                + Arrays.toString(arr));
    }

    public static int[] addX(int n, int arr[],int x)
    {

        double middle = arr.length % 2 == 0 ?  middle = arr.length / 2 : arr.length / 2 + 1 ;

        int newArr[] = new int[n+1];
        for (int i = 0; i < n+1; i++){
            if(i < middle) {
                newArr[i] = arr[i];
            }
            if(i == middle) {
                newArr[i] = x;
            }
            else if(i > middle) {
                newArr[i] = arr[i -1];
            }
        }
        return newArr;
    }

}
