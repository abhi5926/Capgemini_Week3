import firstnegativenumber.FirstNegativeNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingFirstNegativeNumber {
    @Test
    void testingFirstNegativeNumber()
    {
        FirstNegativeNumber ob = new FirstNegativeNumber();
        int[] arr = {1,-2,3};
        Assertions.assertEquals(1,ob.firstNegativeNumber(arr));
    }
}
