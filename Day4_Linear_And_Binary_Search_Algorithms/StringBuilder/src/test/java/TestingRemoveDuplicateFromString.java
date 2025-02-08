import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import removeduplicatefromstring.RemoveDuplicateFromString;

public class TestingRemoveDuplicateFromString {
    @Test
    void testingRemoveDuplicate(){
        RemoveDuplicateFromString ob1 = new RemoveDuplicateFromString();
        String input = "programming";
        Assertions.assertEquals("progamin",ob1.removeDuplicates(input));
    }
}
