package mergesorttosortprice;
import java.util.*;
// Creating class name as merge sort
public class MergeSort {
    // Method to merge array
    static void merge(int arr[],int left,int mid,int right){
        // Calculating the length of the arrays
        int n1 = mid - left + 1;
        int n2 = right - left;

        // Creating temporary arrays
        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];

        // Insering element in left array
        for(int i=0;i<n1;i++){
            leftArray[i] = arr[left + i];
        }
        // Inserting element in right array
        for(int j=0;j<n2;j++){
            rightArray[j] = arr[mid + 1 + j];
        }

        int i=0,j=0;

        // index of merged subarray
        int k = left;
        while(i < n1 && j<n2){
          if(leftArray[i] <= rightArray[j]){
              arr[k] = leftArray[i];
              i++;
          }else{
              arr[k] = rightArray[j];
              j++;
          }
          k++;
        }
        while(i < n1){
            arr[k]= leftArray[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
    // Method to sort arrays by using merge sort
    static void sort(int[] arr,int left,int right){
        if(left <= right){
            int mid = left + (right - 1) / 2;
            sort(arr,left,mid);
            sort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
    // Method to display the elements of the array
    static void printArray(int[] price){
        int n= price.length;
        for(int i=0;i<n;i++){
            System.out.println(price[i]+" ");
        }
    }
    public static void main(String[] args) {
        // Creating array
        int[] price ={12,11,2,6,1,4};
         // Calling Method
        sort(price,0,(price.length - 1));
    // Display method calling
        System.out.println("Sorted array :");
        printArray(price);
    }
}
