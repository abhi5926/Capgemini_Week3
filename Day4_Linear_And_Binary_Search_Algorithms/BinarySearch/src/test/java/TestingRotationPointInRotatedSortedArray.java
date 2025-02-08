import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import rotationpointinrotatedsortedarray.RotationPoint;

public class TestingRotationPointInRotatedSortedArray {
    @Test
    void rotationPointInRotatedSortedArray()
    {
        RotationPoint ob = new RotationPoint();
        int arr[] = {6,7,9,15,20,2,3};
        Assertions.assertEquals(5,ob.pointCalculate(arr));
    }
}
