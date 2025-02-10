import org.junit.Test;

import searchtarget.BinarySearch;
import searchtarget.LinearSearch;

public class SearchTargetTesting {
     @Test
     public void linearSearch(){
        LinearSearch ob = new LinearSearch();
        int arr[] = {1,2,3,4,5};
        int target = 3;
        ob.linearSearch(arr, target);
    }

    @Test
    public void binarySearch(){
        BinarySearch ob1 = new BinarySearch();
        int arr[] = {1,2,3,4,5};
        int target = 3;
        int left = 0;
        int right = arr.length - 1;
        ob1.binarySearch(arr,target,left,right);
    }
}
