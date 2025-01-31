package sampleproblemhashmapandhashfunction.longestconsecutivesequence;

import java.util.HashSet;

// Creating class LongestConsecutiveSequence
public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Insert all elements into a HashSet
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestSequence = 0;

        // Iterate through each element
        for (int num : numSet) {
            // Check if it's the beginning of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                //  Find the length of the consecutive sequence
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                //Update the longest sequence
                longestSequence = Math.max(longestSequence, currentStreak);
            }
        }

        return longestSequence;
    }
   // Main Method
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence Length: " + longestConsecutive(nums));
    }
}

