import occurenceoffirstandlast.OccurenceOfFirstAndLast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OccurenceOfFirstAndLastTesting {
    @Test
    void occurenceOfFirstAndLast(){
        OccurenceOfFirstAndLast ob4 = new OccurenceOfFirstAndLast();
        int arr[] = {1,2,3,4,5};
        int target = 3;
        int left = 0;
        int right = arr.length -1;
        Assertions.assertEquals(2,ob4.firstOccurenceIndex(arr,target,left,right));
        Assertions.assertEquals(2,ob4.lastOccurenceIndex(arr,target,left,right));
    }
}
