package searchtarget;

public class BinarySearch {
    // Creating Method for binary Search
    public int binarySearch(int arr[], int target,int left,int right){
        // Calculating Mid
        int mid = (left + right) /2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] < target){
            return binarySearch(arr,target,mid +1,right);
        }
        else{
            return binarySearch(arr,target,left,mid -1);
        }
    }
}
