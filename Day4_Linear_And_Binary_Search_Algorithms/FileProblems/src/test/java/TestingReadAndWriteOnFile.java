import inputstreamreader.readandwriteonfileusinginputsreamreader.ReadAndWriteOnFile;
import org.junit.jupiter.api.Test;

public class TestingReadAndWriteOnFile {
    @Test
    void testingReadAndWriteOnFile(){
        ReadAndWriteOnFile ob4 = new ReadAndWriteOnFile();
        ob4.printWithFile("D:\\Capgemini Notes\\Sample.txt");
    }
}
