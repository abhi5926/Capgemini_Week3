package removeduplicatefromstring;

import java.util.HashMap;

import java.util.HashSet;

public class RemoveDuplicateFromString {
    // Method to remove duplicate
    public static String removeDuplicates(String str) {
        // Creating StringBuilder
        StringBuilder sb = new StringBuilder();
        // Creating HashSet
        HashSet<Character> seen = new HashSet<>();
       // Running loop
        for (char c : str.toCharArray()) {
            if (!seen.contains(c)) {
                sb.append(c);
                seen.add(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // String taking as input
        String input = "programming";
        String result = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + result);
    }
}

