public class selectSort {
    public static void main(String[] args) {
        int[] arr = {1,3,2,45,65,33,12};
        selectsort(arr);
        for (int num: arr){
            System.out.print(num+" ");
        }
    }
    public static void selectsort(int[] arr){
        for (int i=0; i<arr.length-1; i++){
            for (int j= i+1; j<arr.length; j++){
//                if (arr[i]>arr[j+1]){
//                    arr[i] = arr[i]^arr[j+1];
//                    arr[j+1] = arr[i]^arr[j+1];
//                    arr[i] = arr[i]^arr[j+1];
//                }
                if (arr[i]>arr[j]){
                    arr[i] = arr[i]^arr[j];
                    arr[j] = arr[i]^arr[j];
                    arr[i] = arr[i]^arr[j];
                }
            }
        }
    }
}
