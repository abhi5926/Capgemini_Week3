package concatinatestringusingstringbuffer;

public class ConcatenateString {
       // Method to append String in String Buffer
        public static String concatenate(String[] strings) {
            StringBuffer sb = new StringBuffer();

            for (String str : strings) {
                sb.append(str);
            }

            return sb.toString();
        }

        public static void main(String[] args) {
            // Taking input as String
            String[] strings = {"Hello", " ", "world", "!", " Welcome", " to", " Java"};
            // Calling Method
            String result = concatenate(strings);
            // Display result
            System.out.println("Concatenated String: " + result);
        }
    }


