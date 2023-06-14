public class SortColors_75 {
     // https://leetcode.com/problems/sort-colors/description/
     class Solution {
          public void sortColors(int[] nums) {
               int low = 0, mid = 0, high = nums.length - 1;
               while (mid <= high) {
                    if (nums[mid] == 0) {
                         swap(nums, low, mid);
                         low++;
                         mid++;
                    } else if (nums[mid] == 1) {
                         mid++;
                    } else {
                         swap(nums, mid, high);
                         high--;
                    }
               }
          }

          public void swap(int[] nums, int i, int j) {
               int t = nums[i];
               nums[i] = nums[j];
               nums[j] = t;
          }
     }
}
