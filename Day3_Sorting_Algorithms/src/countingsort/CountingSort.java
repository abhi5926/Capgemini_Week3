package countingsort;

public class CountingSort {

    // Method to perform counting sort on student ages
    public static void countingSort(int[] ages) {
        int minAge = 10;
        int maxAge = 18;
        int range = maxAge - minAge + 1;
        //  Create a count array to store frequency of each age
        int[] count = new int[range];

        // Store the count of occurrences of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        //  Modify the count array by adding the cumulative frequencies
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array using the cumulative count array
        int[] output = new int[ages.length];
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            output[count[age - minAge] - 1] = age;
            count[age - minAge]--;
        }

        // Copy the sorted elements into the original array
        System.arraycopy(output, 0, ages, 0, ages.length);
    }

    // Method to print the sorted array
    public static void printArray(int[] ages) {
        for (int age : ages) {
            System.out.print(age + " ");
        }
        System.out.println();
    }

    // Main method to test the counting sort
    public static void main(String[] args) {
        // Creating Array
        int[] studentAges = {16, 14, 10, 13, 18, 12, 17, 15, 11, 14};
        // Calling Counting Sort Method
        countingSort(studentAges);

      // To display all the elements
        printArray(studentAges);
    }
}

