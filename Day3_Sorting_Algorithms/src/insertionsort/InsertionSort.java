package insertionsort;

import java.util.*;
// Creating class to implement insertion sort
public class InsertionSort {
    // method performing insertion sort operation
    public static void insertionSort(int[] arr,int n){
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j= i-1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        // Taking array as input
        int[] empId ={5,6,8,9,2,5};
        int n =empId.length;
        // Method calling
        insertionSort(empId,n);
        // Display the output
        for(int i=0;i<n;i++){
            System.out.println(empId[i] + " ");
        }

    }
}
