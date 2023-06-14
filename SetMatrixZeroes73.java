public class SetMatrixZeroes73 {
     // https://leetcode.com/problems/set-matrix-zeroes/
     class Solution {
          public void setZeroes(int[][] mat) {
               int r = mat.length;
               int c = mat[0].length;
               boolean isr = false, isc = false;
               for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                         if (mat[i][j] == 0) {
                              if (i == 0)
                                   isr = true;
                              if (j == 0)
                                   isc = true;
                              mat[i][0] = 0;
                              mat[0][j] = 0;
                         }
                    }
               }
               //
               for (int i = 1; i < r; i++) {
                    for (int j = 1; j < c; j++) {
                         if (mat[i][0] == 0 || mat[0][j] == 0) {

                              mat[i][j] = 0;
                         }
                    }
               }

               if (isc) {
                    for (int i = 0; i < r; i++) {
                         mat[i][0] = 0;
                    }
               }
               if (isr) {
                    for (int j = 0; j < c; j++) {
                         mat[0][j] = 0;
                    }
               }
          }
     }
}
