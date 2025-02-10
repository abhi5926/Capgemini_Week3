import largefilereadingefficiency.FileReaderParformance;
import largefilereadingefficiency.InputStreamReaderParformance;
import org.junit.Test;

public class LargeFileReadingTesting {
    // Creating String that will Store File Path
    String filePath = "D:\\Capgemini Notes\\Sample.txt";
    @Test
    public void readingfileWithFileReader(){
        // Creating object of the class FileReaderParformance
        FileReaderParformance ob = new FileReaderParformance();
        ob.readWithFileReader(filePath);
    }

    @Test
    public void readingFileWithInputStreamReader(){
        // Creating object of the class FileReaderParformance
        InputStreamReaderParformance ob1 = new InputStreamReaderParformance();
        ob1.readWithInputStreamReader(filePath);
    }
}
