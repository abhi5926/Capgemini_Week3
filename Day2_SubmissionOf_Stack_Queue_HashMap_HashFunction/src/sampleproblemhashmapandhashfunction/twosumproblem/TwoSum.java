package sampleproblemhashmapandhashfunction.twosumproblem;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the number and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];  // Find the complement value

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // If it does, return the indices of the current element and the complement
                return new int[] {map.get(complement), i};
            }

            // If the complement doesn't exist, store the current number and its index in the map
            map.put(nums[i], i);
        }

        // Return an empty array if no solution is found
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        // Example usage
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        if (result[0] != -1) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}

