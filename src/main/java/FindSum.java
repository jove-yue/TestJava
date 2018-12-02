import java.util.Arrays;

public class FindSum {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7,9,4,1};
        findSum1(arr, 10);
    }
    public static void findSum1(int[] arr, int sum){
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length-1;

        while (low < high){
            if (arr[low]+arr[high]<sum){
                low++;
            }
            else if (arr[low]+arr[high]>sum){
                high--;
            }
            else {
                System.out.println(arr[low] + "," +arr[high]);
                low++;
                high--;
            }
        }
    }
}
