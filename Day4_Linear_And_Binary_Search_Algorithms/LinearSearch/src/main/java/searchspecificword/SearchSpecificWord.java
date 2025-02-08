package searchspecificword;

public class SearchSpecificWord {
    // Creating method to search word
    public static String searchWord(String sentence[],String word){
         // running loop to check
        for(String str : sentence){
            if(str.contains(word)){
                return word;
            }

        }
        return "Not Found";
    }
    public static void main(String[] args) {
        // Creating array of type String
        String sentence[] = {"Hello","How","Are","You"};
        // Taking word as input
        String word = "How";
        // Calling Method and Store the result
        String result = searchWord(sentence,word);
        // Display the result
        System.out.println(result);
    }
}
