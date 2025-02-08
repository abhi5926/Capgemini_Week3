package reversestring;

public class ReverseString {
    public static String reverseString(String string){
        // Creating String Builder
        StringBuilder result = new StringBuilder(string);
        // Reversing String Builder
        result.reverse();

        return result.toString();
    }
    public static void main(String[] args) {
        // Creating String and assigning text
        String string = "hello";
        // Display the output
        System.out.println(reverseString(string));
    }

}
