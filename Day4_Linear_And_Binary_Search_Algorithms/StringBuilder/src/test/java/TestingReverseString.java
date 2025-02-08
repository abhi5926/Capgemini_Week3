import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reversestring.ReverseString;

public class TestingReverseString {
    @Test
    void testingReverseString(){
        ReverseString ob = new ReverseString();
        String str = "hello";
        Assertions.assertEquals("olleh",ob.reverseString(str));
    }
}
