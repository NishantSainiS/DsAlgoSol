public class NextPermutation_31 {
     // https://leetcode.com/problems/next-permutation/description/
     class Solution {
          public void nextPermutation(int[] nums) {
               int id = -1;
               int l = nums.length;
               for (int i = l - 1; i > 0; i--) {
                    if (nums[i - 1] < nums[i]) {
                         id = i - 1;
                         break;
                    }
               }

               if (id != -1) {
                    for (int i = l - 1; i > id; i--) {
                         if (nums[id] < nums[i]) {
                              swap(nums, i, id);
                              break;
                         }
                    }
                    reverse(nums, id + 1, l - 1);
               } else {
                    reverse(nums, 0, l - 1);
               }

          }

          public void swap(int[] nums, int i, int j) {
               int temp = nums[i];
               nums[i] = nums[j];
               nums[j] = temp;
          }

          public void reverse(int[] nums, int i, int j) {
               while (i < j) {
                    swap(nums, i, j);
                    i++;
                    j--;
               }
          }

     }

}
