public class MaximumSubarray_53 {
     // https://leetcode.com/problems/maximum-subarray/description/
     class Solution {
          public int maxSubArray(int[] nums) {
               int ans = nums[0];
               int curr_ans = nums[0];
               for (int i = 1; i < nums.length; i++) {
                    if (curr_ans < 0) {
                         curr_ans = nums[i];
                    } else {
                         curr_ans += nums[i];
                    }
                    ans = Math.max(ans, curr_ans);
               }
               return ans;
          }
     }
}
