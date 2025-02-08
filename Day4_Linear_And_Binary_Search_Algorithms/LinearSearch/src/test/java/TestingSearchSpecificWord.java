import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingSearchSpecificWord {
    @Test
    void testingSearchSpecificWord(){
        searchspecificword.SearchSpecificWord ob1 = new searchspecificword.SearchSpecificWord();
        String[] sentence = {"Hello","How","Are","You"};
        String word = "How";
        Assertions.assertEquals("How",ob1.searchWord(sentence,word));
    }
}
