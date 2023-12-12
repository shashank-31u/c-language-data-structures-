import java.util.*;
public class quickSort {
    public static partition(int arr[],int high,int low){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low,j<high,j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=int temp;
            }
            i++;
            int temp=arr[i];
            arr[i]=arr[high];
            arr[high]=temp;
            return i;
        }
    }
public static void  QuickSort(int arr,int low,int high){
if(low<high){
    int pidx=partition(arr,low,high);
    QuickSort(arr, low, pidx-1);
    QuickSort(arr,pidx+1,high);

}
}
    


public static void main(String args[]){
    int []arr={3,6,2,6,8,7,7};
    int n=arr.length;
    QuickSort(arr,0,n-1);
}
}