package sampleproblemstackandqueue.slidingwindowmaximumproblem;
import java.util.*;
class SlidingWindowMaximum {

    // Method to find for finding each sliding window
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();

        // Processing the element separately
        for (int i = 0; i < k; i++) {
            // Remove elements from deque which are smaller than the current element
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }

        // Storing maximum
        result[0] = nums[deque.peekFirst()];

        // Processing rest of the element
        for (int i = k; i < n; i++) {
            // Remove those indices that are out od window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.removeFirst();
            }

            // Remove element from deQueue
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.removeLast();
            }

            // Add the current element index
            deque.addLast(i);

            // current maximum is front of the queue
            result[i - k + 1] = nums[deque.peekFirst()];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        // Get the result for the sliding window maximums
        int[] result = maxSlidingWindow(nums, k);

        // Print the result
        for (int max : result) {
            System.out.print(max + " ");
        }
    }
}

