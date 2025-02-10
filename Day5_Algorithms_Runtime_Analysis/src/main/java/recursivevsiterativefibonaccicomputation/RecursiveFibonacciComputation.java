package recursivevsiterativefibonaccicomputation;

public class RecursiveFibonacciComputation {
    // Method for recursive fibonacci computation
    public int fibonacciRecursive(int number){
        if(number <= 1){
            return number;
        }
            return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);

    }
}
