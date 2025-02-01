package selectionsort_sortexamscores;


import java.util.*;
public class SelectionSort {
    // Method to sort and print the exam scores
    public static void selectionSort(int[] arr){
        // storing array length in a variable
        int n = arr.length;
        int min,loc,temp;
        for(int i=0;i<n-1;i++){
            min = arr[i];
            loc = i;
            for(int j=i+1;j<n;j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    loc = j;
                }
            }
            // Swapping
                temp = arr[i];
                arr[i] = arr[loc];
                arr[loc] = temp;

        }

        // Printing elements of the array
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
    }
    // Main Method
    public static void main(String[] args) {
        // Creating array
        int[] arr = {50,20,10,90,40};
        // calling method
        selectionSort(arr);


    }
}

