package filereader.findoccurenceofaword;

// Importing liberaries
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class FindOccurenceOfWord {
    public void findOccurence(){
        try {
            // Creating object of file reader class
            FileReader ob = new FileReader("D:\\Capgemini Notes\\Sample.txt");
            // Creating BufferReader class object
            BufferedReader br = new BufferedReader(ob);

            String content = br.readLine();
            String word = "Abhishek";
            int count = 1;

            //running loop to count frequency
            while ((content = br.readLine()) != null)
            {
                String[] arr = content.split("");
                int n = arr.length;
                for (int i = 0; i < n; i++)
                {
                    if (arr[i] == word)
                    {
                        count++;
                    }
                }
            }

            System.out.println("The Occurence of the word "+word +" is "+count);
        }
        // Creating Exception object
        catch (IOException e){
            System.out.println("Error Occured "+e.getMessage());
        }

    }
    public static void main(String[] args) {

        FindOccurenceOfWord ob = new FindOccurenceOfWord();
        ob.findOccurence();
    }
}
