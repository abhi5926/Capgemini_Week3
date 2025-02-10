package compairisonstringstringbufferstringbuilder;

public class StringBufferParformance {
    // Concatenation with StringBuffer
    public StringBuffer stringBufferParformance(int n,String str){
     StringBuffer result = new StringBuffer();
      for(int i=0;i<n;i++){
          result.append(str);
      }
      return result;
    }
}
