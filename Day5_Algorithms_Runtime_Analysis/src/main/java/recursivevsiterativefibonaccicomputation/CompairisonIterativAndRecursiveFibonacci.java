package recursivevsiterativefibonaccicomputation;

public class CompairisonIterativAndRecursiveFibonacci {
    public static void main(String[] args) {
        // Creating object of class IterativeFibonacciComputation
        IterativeFibonacciComputation ob = new IterativeFibonacciComputation();

        // Creating object of class RecursiveFibonacciComputation
        RecursiveFibonacciComputation ob1 = new RecursiveFibonacciComputation();

        // Method calling iterativefibonacci
        long st = System.nanoTime();
        ob.iterativefibonacci(10);
        long ed = System.nanoTime();

        // // Method calling recursiveFibonacci
        long start = System.nanoTime();
        ob1.fibonacciRecursive(10);
        long end = System.nanoTime();

        // Display the result
        System.out.println("The Execution Time of the Iterative Fibonacci :"+(ed - st));
        System.out.println("The Execution Time of the Recursive Fibonacci :"+(end - start));
    }

}
