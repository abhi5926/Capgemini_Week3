package sampleproblemhashmapandhashfunction.pairwithgivensum;

import java.util.HashSet;

public class PairWithGivenSum {
    // Function to check if there is a pair with the given sum
    public static boolean hasPairWithSum(int[] arr, int target) {
        // HashSet
        HashSet<Integer> seen = new HashSet<>();

        // running loop to access array element
        for (int num : arr) {
            int complement = target - num;

            // if complent already in the set return true;
            if (seen.contains(complement)) {
                return true;
            }

            // Add the current number to the set for future checks
            seen.add(num);
        }

        // If no pair is found, return false
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int target = 17;

        // Check if the pair with the given sum exists
        if (hasPairWithSum(arr, target)) {
            System.out.println("Pair found with the given sum.");
        } else {
            System.out.println("No pair found with the given sum.");
        }
    }
}

