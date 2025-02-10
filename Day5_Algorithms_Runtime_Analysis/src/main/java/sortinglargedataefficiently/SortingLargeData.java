package sortinglargedataefficiently;

public class SortingLargeData {
    public static void main(String[] args){
        // Creating object of BubbleSort class
        BubbleSort ob = new BubbleSort();

        // Creating object of MergeSort class
       MergeSort ob1 = new MergeSort();

        // Creating object of QuickSort class
        QuickSort ob2 = new QuickSort();

        // Creating Array
        int arr[] = {3,1,2,5,6};
        int left = 0;
        int right = arr.length -1;
        //Calling Method of bubble Sort
        long st = System.nanoTime();
        ob.bubbleSort(arr);
        long ed = System.nanoTime();

        // Calling Method of MergeSort
        long start = System.nanoTime();
        ob1.sort(arr,left,right);
        long end = System.nanoTime();

        // Calling Method of QuickSort
        long startTime = System.nanoTime();
        ob2.quickSort(arr,left,right);
        long endTime = System.nanoTime();

        // Display
        System.out.println("Bubble Sort Execution Time :"+(ed - st));
        System.out.println("Merge Sort Execution Time :"+(end - start));
        System.out.println("Quick Sort Execution Time :"+(endTime - startTime));
    }
}
