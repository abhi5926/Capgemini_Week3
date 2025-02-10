package compairingdifferentdatastructuresforthesearching;

import java.util.HashSet;
import java.util.TreeSet;

public class CompairisonDataStructures {
    // Method for searching in array
    public static int searchArray(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return target;
            }
        }
        return -1;
    }
    // Method to search in HashSet
    public static  int searchInHashSet(HashSet<Integer> hashSet, int target){
        if(hashSet.contains(target)){
            return target;
        }
        return -1;
    }
    // Method To Search in TreeSet
    public static int treeSetSearch(TreeSet<Integer> treeSet, int target){
        if(treeSet.contains(target)){
            return target;
        }
        return -1;
    }

    // Main Method
    public static void main(String[] args) {
        int[] datasetSizes = {1000, 100000, 1000000};

        // Creating an array, HashSet, and TreeSet
        int [] arr = new int [1000];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Populating the data structures with numbers
        for (int i = 0; i < 1000; i++) {
            arr[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        // Element to search for
        int target = 999;

        // Measuring array Execution Time for array
        long st = System.nanoTime();
        searchArray(arr,target);
        long ed = System.nanoTime();

        // Mesuring HashSet Exucution time
        long start = System.nanoTime();
        searchInHashSet( hashSet, target);
        long end = System.nanoTime();

        // Mesuring TreeSet Exucution time
        long startTime = System.nanoTime();
        treeSetSearch(treeSet, target);
        long endTime = System.nanoTime();

        // Display the Execution
        System.out.println("The Execution Time Taken By Array is :"+(ed-st));
        System.out.println("The Execution Time Taken By HashSet is :"+(end-start));
        System.out.println("The Execution Time Taken By TreeSet is :"+(endTime-startTime));
    }
}
