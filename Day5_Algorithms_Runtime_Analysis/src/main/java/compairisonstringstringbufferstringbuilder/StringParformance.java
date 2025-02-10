package compairisonstringstringbufferstringbuilder;
import java.util.*;
public class StringParformance {
    // Concatenation with String
    public String stringParformance(int n,String str){
        String result ="";
        for(int i=0;i<n;i++){
            result += str;
        }
        return result;
    }

}
