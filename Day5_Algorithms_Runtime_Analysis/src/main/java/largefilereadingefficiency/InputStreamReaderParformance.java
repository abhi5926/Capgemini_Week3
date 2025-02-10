package largefilereadingefficiency;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderParformance {
    // Method to read file using InputStreamReader
    public  void readWithInputStreamReader(String filePath) {
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath))) {
            int character;
            while ((character = inputStreamReader.read()) != -1) {

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
