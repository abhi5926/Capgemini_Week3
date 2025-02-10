package sortinglargedataefficiently;

public class MergeSort {

    public void merge(int arr[],int l,int mid ,int r){
        // Calculating Arrays Length
        int n1 = mid -l + 1;
        int n2 = r - mid;
      // Creating Left and right array
        int left[] = new int[n1];
        int right[] = new int[n2];

        // Storing element in left array
        for(int i=0;i<n1;i++){
            left[i] = arr[l+i];
        }
      // Storing element in write array
        for(int j=0;j<n2;j++){
            right[j] = arr[mid + 1 + j];
        }

        // Stroring this element in array
        int i=0,j=0,k=l;

        // running while loop to store element in array
        while(i < n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Remaining left element Storing in array
        while(i < n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        // Remaining right array element
        while(j < n2){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
    // Method to divide array from mid
    public void sort(int arr[],int l,int r){
        if(l < r){
            // Claculating mid
            int mid = l + (r - l) / 2;
            sort(arr,l,mid);
            sort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
}
