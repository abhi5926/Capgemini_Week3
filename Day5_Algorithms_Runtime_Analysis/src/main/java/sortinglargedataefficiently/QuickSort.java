package sortinglargedataefficiently;

public class QuickSort {
    //  Prtition Method
    public int partition(int arr[] ,int s,int e){
        // Choosing pivot as end element in array
        int pivot = arr[e];
        int pindex = s;
        // Compairing elements with pivot
        for(int i =s;i<e;i++){
            if(arr[i] < pivot){
             int temp = arr[i];
             arr[i] = arr[pindex];
             arr[pindex] = temp;
             pindex++;
            }
        }
        // putting pivot at pivot index
        int temp = arr[e];
        arr[e] = arr[pindex];
        arr[pindex] = temp;
        return pindex;
    }
    // Method to divide array
    public void quickSort(int arr[], int s,int e){
        if(s < e){
            // calling recursion to divide array
            int p = partition(arr,s,e);
            quickSort(arr,s,(p-1));
            quickSort(arr,(p+1),e);
        }
    }
}
