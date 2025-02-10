import org.junit.Test;
import recursivevsiterativefibonaccicomputation.IterativeFibonacciComputation;
import recursivevsiterativefibonaccicomputation.RecursiveFibonacciComputation;

public class RecursiveAndIterativeFibonacciComputationTesting {
    @Test
    public void recursiveFibonacciComputation(){
        // Creating objects of class RecursiveFibonacciComputation
        RecursiveFibonacciComputation ob = new RecursiveFibonacciComputation();
        ob.fibonacciRecursive(10);
    }
    @Test
    public void iterativeFibonacciComputation(){
        // Creating objects of class iterartiveFibonacciComputation
        IterativeFibonacciComputation ob1 = new IterativeFibonacciComputation();
        ob1.iterativefibonacci(10);
    }
}
