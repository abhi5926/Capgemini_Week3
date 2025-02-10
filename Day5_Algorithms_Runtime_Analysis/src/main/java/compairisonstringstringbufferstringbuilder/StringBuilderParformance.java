package compairisonstringstringbufferstringbuilder;

public class StringBuilderParformance {
    // Concatenation With StringBuilder
    public StringBuilder stringBuilderParformance(int n,String str){
        StringBuilder result = new StringBuilder();
        for(int i=0;i<n;i++){
            result.append(str);
        }
        return result;
    }
}
