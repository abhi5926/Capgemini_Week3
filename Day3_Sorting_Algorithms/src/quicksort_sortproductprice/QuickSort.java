package quicksort_sortproductprice;

public class QuickSort {
    public static int partition(int price[], int s, int e) {
        // Creating pivot
        int pivot = price[e];
        int pindex = s;
    // running loop from starting to end
        for (int i = s; i < e; i++) {
            if (price[i] < pivot) {
                int temp = price[i];
                price[i] = price[pindex];
                price[pindex] = temp;
                pindex++;
            }
        }
        int temp = price[e];
        price[e] = price[pindex];
        price[pindex] = temp;
        return pindex;
    }
    // Dividing the array by following method
    public static void quickSort(int[] price, int s, int e) {
        // Checking condition
        if (s < e) {
            int p = partition(price, s, e);
            quickSort(price, s, (p - 1));
            quickSort(price, (p + 1), e);
        }

}
    // Main Method
    public static void main(String[] args) {
        int[] price ={40,60,90,20,30};
        int n = price.length;
        // Calling method
        quickSort(price,0,(n-1));
        // Display  the sorted price array
       for(int i=0;i<n;i++){
         System.out.println(price[i] + " ");
        }
    }
}
