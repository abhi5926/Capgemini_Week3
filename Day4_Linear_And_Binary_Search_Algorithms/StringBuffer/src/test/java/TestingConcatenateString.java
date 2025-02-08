import concatinatestringusingstringbuffer.ConcatenateString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingConcatenateString {
    @Test
    void testingConcatenateString()
    {
        ConcatenateString ob1 = new ConcatenateString();
        String[] strings = {"Hello", " ", "world", "!", " Welcome", " to", " Java"};
        Assertions.assertEquals("Hello world! Welcome to Java",ob1.concatenate(strings));
    }
}
