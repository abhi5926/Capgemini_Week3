import challengeproblemlinearandbinarysearch.CommonProblem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingCommonProblem {
    @Test
    void testingCommonProblem(){
        CommonProblem ob2 = new CommonProblem();
        int arr[] = {1,2,3,5,6,7,8,9};
        int target = 3;
        int left = 0;
        int right = arr.length -1;
        Assertions.assertEquals(4,ob2.firstMissing(arr));
        Assertions.assertEquals(2,ob2.findIndex(arr,target,left,right));
    }
}
