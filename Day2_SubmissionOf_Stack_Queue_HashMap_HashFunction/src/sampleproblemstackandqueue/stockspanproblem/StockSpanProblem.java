package sampleproblemstackandqueue.stockspanproblem;

import java.util.Stack;

public class StockSpanProblem {

    // calculate stock span
    public static int[] calculateStockSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];


        Stack<Integer> stack = new Stack<>();

        // Loop through all the days
        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If stack is empty, it means the current price is the highest so far
            span[i] = (stack.isEmpty()) ? (i + 1) : (i - stack.peek());
            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        // Calculate the span for each stock price
        int[] span = calculateStockSpan(prices);

        // Print the span for each day
        for (int i : span) {
            System.out.print(i + " ");
        }
    }
}


