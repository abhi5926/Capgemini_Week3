package largefilereadingefficiency;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderParformance {
    public void readWithFileReader(String filePath) {
        try (FileReader fileReader = new FileReader(filePath)) {
            int character;
            while ((character = fileReader.read()) != -1) {
                // Just reading characters, no processing done
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
