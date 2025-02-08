package firstnegativenumber;

public class FirstNegativeNumber {
    // Writing method to find the first negative number
    public static int firstNegativeNumber(int[] arr){
        // Calculating array length
        int n = arr.length;
        // Running loop to search in array
        for(int i=0;i<n;i++){
            if(arr[i] < 0){
            return i;
            }
        }
        return -1;
    }
    // Main Method
    public static void main(String[] args) {
        // Creating arry
        int arr[] = {5,2,1,-3,3,4,-8};

        // Display result and also calling method with it
        System.out.println("The index of First Negative Number is :"+firstNegativeNumber(arr));
    }
}
