package searchtarget;

public class SearchTarget {
    public static void main(String[] args) {
        // Creating Object of BinarySearch class
        BinarySearch ob = new BinarySearch();

        // Creating Object of LinearSearch class
        LinearSearch ob1 = new LinearSearch();
        // Creating Array
        int arr[] ={1,2,3,4,5,6,7};
        // Target element
        int target = 3;
        int left =0;
        int right = arr.length -1;

        // Method calling of  binary Search
        long st = System.nanoTime();
        ob.binarySearch(arr,3,left, right);
        long ed = System.nanoTime();

        System.out.println("Execution Time Taken By Binary Search Algorithm :"+(ed-st));

        // Method calling of Linear Search
        long start = System.nanoTime();
        ob1.linearSearch(arr,target);
        long end = System.nanoTime();
        System.out.println("Execution Time Taken By Linear Search :"+ (end-start));

    }
}
