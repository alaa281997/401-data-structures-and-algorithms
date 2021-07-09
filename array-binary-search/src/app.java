public class app {
    public static void main(String[] args) {
        int a[] = {-131, -82, 0, 27, 42, 68, 179};
        System.out.println(binsearch(a,42));
    }
    public static int binsearch(int[] list, int target)
    {

        int left = 0;
        int right =list.length ;

        while(left <= right){
            int middle = (left + right) /2;
            if (target<list[middle])
            {
                right = middle -1;
            }
            else if (target > list[middle]){
                left = middle +1;
            }
            else{
                return middle;
            }
        }
        return -1;
    }


}
