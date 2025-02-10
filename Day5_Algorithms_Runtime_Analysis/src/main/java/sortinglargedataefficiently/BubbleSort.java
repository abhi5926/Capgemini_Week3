package sortinglargedataefficiently;

public class BubbleSort {
    // Creating Method for Bubble Sort
    public void bubbleSort(int arr[]){
        // Storing array length in  a variable
        int n = arr.length;
        // running loop for bubble sort
        for(int i=0;i<n;i++){
            for(int j = 0;j<n-1;j++){
                if(arr[j+1] < arr[j]){
                    // Swapping the element
                    int temp =arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
