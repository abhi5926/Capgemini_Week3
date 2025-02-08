import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchTargetValueInMatrix {
    @Test
    void f5(){
        searchtargetvaluein2dsortedmatrix.SearchTargetValueInMatrix ob5 = new searchtargetvaluein2dsortedmatrix.SearchTargetValueInMatrix();
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 3;
        Assertions.assertEquals(true,ob5.searchMatrix(matrix, target));

    }
}
