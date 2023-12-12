public class sortedarray {
    public static boolean findSorted(int arr[],int idx){
        if(arr[idx]==arr.length-1){
            return true;
        }
        if(arr[idx]>=arr[idx+1]){
                return false;           
        }
        else{
            return findSorted(arr[],idx+1);
        }


    }
    public static void main(String args[]){
        int arr[]={1,2,5,6,};
        System.out.println(findSorted(arr,0));
    }
    
}
