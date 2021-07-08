public class arrayReverse {
    public static void main(String[] args) {
     reverse();
    }

    public static void reverse(){
        int[] myNum = {10,20,30,40,50};
        System.out.println("Array is");
        for(int i = 0 ; i <myNum.length;i++){
            System.out.println(myNum[i]+" ");
        }
        System.out.println("Reversed Array is");
        for (int i = myNum.length-1; i > 0 ; i--) {
            System.out.println(myNum[i]+" ");
        }
    }
}
