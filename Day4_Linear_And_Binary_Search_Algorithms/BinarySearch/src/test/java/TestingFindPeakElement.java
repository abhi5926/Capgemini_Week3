import findpeakelement.FindPeakElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingFindPeakElement {
    @Test
    void testingFindPeakElement(){
        FindPeakElement ob1 = new FindPeakElement();
        int arr[] = {1,3,20,4,1,0};
        Assertions.assertEquals(2,ob1.findPeakElement(arr));
    }
}
