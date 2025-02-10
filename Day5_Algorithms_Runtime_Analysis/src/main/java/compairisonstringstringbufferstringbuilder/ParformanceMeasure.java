package compairisonstringstringbufferstringbuilder;

public class ParformanceMeasure {
    // Main Method
    public static void main(String[] args) {
        // Creating Object of String class
        StringParformance ob = new StringParformance();
        
        // Creating Object of StringBufferParformance Class
        StringBufferParformance ob1 = new StringBufferParformance();
        
        // Creating Object Of StringBuilderParformance class
        StringBuilderParformance ob2 = new StringBuilderParformance();
        
        int n = 1000;
        String str = "hello";

        // String Parformance
        long st = System.nanoTime();
        ob.stringParformance(n,str);
        long ed = System.nanoTime();

        // StringBuffer Parformance
        long start = System.nanoTime();
        ob1.stringBufferParformance(n,str);
        long end = System.nanoTime();

        // StringBuilder Parformance
        long startTime = System.nanoTime();
        ob2.stringBuilderParformance(n,str);
        long endTime = System.nanoTime();

        // Display
        System.out.println("The Execution Time Taken buy String :"+(ed-st));
        System.out.println("The Execution Time Taken buy StringBuffer :"+(end-start));
        System.out.println("The Execution Time Taken buy StringBuilder :"+(endTime-startTime));
    }
}
