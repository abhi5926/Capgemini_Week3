import compairisonstringstringbufferstringbuilder.StringBufferParformance;
import compairisonstringstringbufferstringbuilder.StringBuilderParformance;
import compairisonstringstringbufferstringbuilder.StringParformance;
import org.junit.Test;

public class TestingStringCompairison {

    // Defining variables
    int n = 1000;
    String str = "hello";

    @Test
  public   void stringParformance(){
        // Creating Object of String Parformance class
        StringParformance ob = new StringParformance();

        // Method call
        ob.stringParformance(n,str);
    }

    @Test
    public void stringBufferParformance(){
        // Creating Object of StringBufferParformance class
        StringBufferParformance ob1 = new StringBufferParformance();

        // Method call
        ob1.stringBufferParformance(n,str);
    }

    @Test
    public void stringBuilderParformance(){
        // Creating Object of StringBuilderParformance class
        StringBuilderParformance ob2 = new StringBuilderParformance();

        // Method call
        ob2.stringBuilderParformance(n,str);
    }
}
