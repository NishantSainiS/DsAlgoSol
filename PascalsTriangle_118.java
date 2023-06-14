import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_118 {
     // https://leetcode.com/problems/pascals-triangle/description/

     class Solution {
          public List<List<Integer>> generate(int numRows) {
               List<List<Integer>> ans = new ArrayList<>();
               for (int i = 0; i < numRows; i++) {
                    ans.add(new ArrayList<Integer>());
                    for (int j = 0; j < i + 1; j++) {
                         if (j == 0 || j == i) {
                              ans.get(i).add(1);
                         } else {
                              ans.get(i).add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
                         }
                    }
               }
               return ans;
          }
     }
}
