package sampleproblemhashmapandhashfunction.findallsubarraywith0sum;
import java.util.*;

// Creating class
class FindAllSubarray {

    // Method to find all Subarry
    public static void findZeroSumSubarrays(int[] arr) {
        // Hash Map
        Map<Integer, List<Integer>> sumMap = new HashMap<>();

        // Initialize the map
        sumMap.put(0, new ArrayList<>());
        sumMap.get(0).add(-1);

        int cumulativeSum = 0;

        // Traverseing array
        for (int i = 0; i < arr.length; i++) {
            cumulativeSum += arr[i];

            // Condition
            if (sumMap.containsKey(cumulativeSum)) {
                List<Integer> indices = sumMap.get(cumulativeSum);
                for (int index : indices) {
                    System.out.println("Subarray with zero sum: " + Arrays.toString(Arrays.copyOfRange(arr, index + 1, i + 1)));
                }
            }
            sumMap.putIfAbsent(cumulativeSum, new ArrayList<>());
            sumMap.get(cumulativeSum).add(i);
        }
    }

    public static void main(String[] args) {
        // Array
        int[] arr = {6, -3, 3, 4, -2, -1, 5, -5};
        // Display 0 sum subarray
        System.out.println("Zero-sum subarrays:");
        // Method to print and claculate
        findZeroSumSubarrays(arr);
    }
}