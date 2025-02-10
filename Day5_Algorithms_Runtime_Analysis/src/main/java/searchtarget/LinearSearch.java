package searchtarget;

// Creating Class
public class LinearSearch {
    // Method for Linear Seacrch
    public int linearSearch(int arr[], int target){
        int n = arr.length;
        // Running loop
        for(int i =0;i<n;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
