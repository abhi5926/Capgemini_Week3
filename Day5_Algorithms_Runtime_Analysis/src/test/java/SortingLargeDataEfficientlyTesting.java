import org.junit.Test;
import searchtarget.LinearSearch;
import sortinglargedataefficiently.BubbleSort;
import sortinglargedataefficiently.MergeSort;
import sortinglargedataefficiently.QuickSort;

public class SortingLargeDataEfficientlyTesting {
    int arr[] = {5,3,1,8,7};
    int n = arr.length;
    int left = 0;
    int right = arr.length - 1;
    @Test
    public void bubbleSort(){
         BubbleSort ob = new BubbleSort();
        ob.bubbleSort(arr);
    }

    @Test
    public void mergeSort(){
        MergeSort ob1 = new MergeSort();
        ob1.sort(arr,left,right);
    }

    @Test
    public void quickSorting(){
        QuickSort ob3 = new QuickSort();
        ob3.quickSort(arr,left,right);
    }

}
