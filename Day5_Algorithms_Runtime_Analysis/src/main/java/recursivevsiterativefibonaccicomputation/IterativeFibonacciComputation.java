package recursivevsiterativefibonaccicomputation;

public class IterativeFibonacciComputation {
   // Method for Iterative fibonacci
    public int iterativefibonacci(int n){
        // Defining Variables
        int a =0, b = 1,sum = 0;
       // Running loop to find fibonacci
        for(int i=2;i<=n;i++){
            sum = a+b;
            a = b;
            b = sum;
        }
        return b;
    }
}
