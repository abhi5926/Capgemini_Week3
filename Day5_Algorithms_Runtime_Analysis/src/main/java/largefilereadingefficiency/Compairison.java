package largefilereadingefficiency;
import java.util.*;

public class Compairison {
    public static void main(String[] args) {
        // Creating object of the class FileReaderParformance
        FileReaderParformance ob = new FileReaderParformance();

        // Creating object of the class FileReaderParformance
        InputStreamReaderParformance ob1 = new InputStreamReaderParformance();

        String filePath = "D:\\Capgemini Notes\\Sample.txt";

        // Method calls
        long st = System.nanoTime();
        ob.readWithFileReader(filePath);
        long ed = System.nanoTime();

        // Method calls
        long start = System.nanoTime();
        ob1.readWithInputStreamReader(filePath);
        long end = System.nanoTime();

        // Display details
        System.out.println("The Reading Time Taken By FileReader is :"+(ed - st));
        System.out.println("The Reading Time Taken By InputStreamReader is :"+(end - start));

    }
}
