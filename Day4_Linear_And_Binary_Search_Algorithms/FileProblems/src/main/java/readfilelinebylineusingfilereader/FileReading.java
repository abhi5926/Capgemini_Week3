package filereader.readfilelinebylineusingfilereader;

// Importing liberaries
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileReading {
    public void fileReading(){
        try {
            // Creating object of File reader class
            FileReader ob = new FileReader("D:\\Capgemini Notes\\Sample.txt");
            // Creating object of bufferedReader Class
            BufferedReader br = new BufferedReader(ob);
            String content = br.readLine();
            while (content != null) {
                System.out.println(content);
                content = br.readLine();
            }
        }
        // Creating object of Exception class
        catch(IOException e){
            System.out.println("Error Message "+e.getMessage());
        }
    }
    public static void main(String[] args) {
        // Creating Object of the class
        FileReading ob = new FileReading();
        ob.fileReading();

        }
}
