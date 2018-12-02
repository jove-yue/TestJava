import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {12,32,24,99,54,76,48};
        mergeSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void mergeSort(int[] a){
        int low = 0;
        int high = a.length-1;
        mergeSort(a,low,high);
    }
    public static void mergeSort(int[] a, int low, int high){
        if (low<high){
            int mid = (low+high)/2;
            mergeSort(a,low,mid);
            mergeSort(a,mid+1,high);
            merge(a,low,mid,high);
        }

    }
    private static void merge(int[] a, int low, int mid, int high) {
        int i,j,k;
        int[] b=new int[a.length];
        for(k=low;k<=high;k++) b[k]=a[k];
        for(i=low,j=mid+1,k=i;i<=mid&&j<=high;k++) {
            if(b[i]<=b[j])
                a[k]=b[i++];
            else
                a[k]=b[j++];
        }
        while(i<=mid) a[k++]=b[i++];
        while(j<=high) a[k++]=b[j++];


    }


}
