package leetcode;

import java.util.ArrayList;
import java.util.List;

public class M02_spiralMatrix {

  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new ArrayList<>();
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
      return result;
    }

    int rb = 0;
    int re = matrix.length - 1;
    int cb = 0;
    int ce = matrix[0].length - 1;

    while (rb <= re && cb <= ce) {
      // 오른쪽으로
      for (int j = cb; j <= ce; j++) {
        result.add(matrix[rb][j]);
      }
      rb++;

      // 밑으로
      for (int j = rb; j <= re; j++) {
        result.add(matrix[j][ce]);
      }
      ce--;

      // 왼쪽으로
      if (rb <= re) {
        for (int j = ce; j >= cb; j--) {
          result.add(matrix[re][j]);
        }
      }
      re--;

      // 위로
      if (cb <= ce) {
        for (int j = re; j >= rb; j--) {
          result.add(matrix[j][cb]);
        }
      }
      cb++;
    }

    return result;
  }

}
