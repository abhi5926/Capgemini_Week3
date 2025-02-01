package bubblesortalgorithm;
import java.util.*;
public class BubbleSort {
    // Method to sort and print the student marks
    public static void bubbleSort(int[] arr){
        // storing array length in a variable
      int n = arr.length;
      for(int i=0;i<n;i++){
          for(int j=0;j<n-1;j++){
              if(arr[i] < arr[j]){
                  int temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
              }
          }
      }

      // Printing elements of the array
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
    }
   // Main Method
    public static void main(String[] args) {
        // Creating array
        int[] arr = {50,20,11,30,40};
        // calling method
       bubbleSort(arr);
    }
}
