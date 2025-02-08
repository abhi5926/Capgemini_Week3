package challengeproblemlinearandbinarysearch;
import java.util.*;
public class CommonProblem {
    // Creating Method to find index
    public static int findIndex(int arr[],int target,int left,int right){
        // Checking Condition
       if(left > right){
           return -1;
       }
       else{
           // calculating mid
           int mid = (left + right)/2;
           if(arr[mid] == target){
               return mid;
           }else if(target < arr[mid]){
               return findIndex(arr,target,left,mid-1);
           }else{
               return findIndex(arr,target,mid+1,right);
           }
       }
    }
    // Method to get first missing element
    public static int firstMissing(int arr[]){
        Arrays.sort(arr);
        int res = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == res){
                res++;
            }else if(arr[i] > res){
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        // Taking arr input
        int arr[] ={1,2,3,5,6,7,9,8};
        // Taking input as target
        int target = 3;
       int left = 0;
       int right = arr.length - 1;
        // Display output
        System.out.println("First missing number is :"+firstMissing(arr));
        // Sorting array
        Arrays.sort(arr);
        System.out.println("The index of the target element is :"+findIndex(arr,target,left,right));
    }
}
