public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int position = binarySearch(arr,8);
        int position1 = rebinarySearch(arr,8,0,arr.length-1);
        System.out.println(position);
        System.out.println(position1);
    }
    public static int binarySearch(int[] arr, int key){
        int low = 0;
        int high = arr.length - 1;
        int middle = 0;

        if (key<arr[low] || key>arr[high] || low>high){
            return -1;
        }
        while (low<=high){
            middle = (low+high)/2;
            if (arr[middle]>key){
                high = middle - 1;
            }else if (arr[middle]<key){
                low = middle + 1;
            }else {
                return middle;
            }
        }
        return -1;
    }
    public static int rebinarySearch(int[] arr, int key,int low, int high){
        if (key<arr[low]||key>arr[high]|| low>high){
            return -1;
        }
        int middle = (low+high)/2;
        if (arr[middle]>key){
            return rebinarySearch(arr,key,low,middle-1);
        }else if (arr[middle]<key){
            return rebinarySearch(arr,key,middle+1,high);
        }else {
            return middle;
        }
    }
}
