/*
Given an integer array nums, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order.
Return the shortest such subarray and output its length.

Example 1:
Input: nums = [2,6,4,8,10,9,15]
Output: 5
Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.

Example 2:
Input: nums = [1,2,3,4]
Output: 0

Example 3:
Input: nums = [1]
Output: 0

Constraints:
1 <= nums.length <= 104
-105 <= nums[i] <= 105
*/
//Super convoluted solution - should not be used - will come back and revise sometime in the future
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        
        //step 1
        for (int i = 1; i<nums.length-1; i++) {
            if (nums[i]<nums[i-1]) {
                left=i-1;
                break;
            }
            else if (nums[i]>nums[i+1]) {
                left=i;
                break;
            }
        }
        for (int i = (nums.length-2); i>=left; i--) {
            if (nums[i]>nums[i+1]) {
                right=i+1;
                break;
            }
        }

        //step2
        for (int i = left-1; i>=0; i--) {
            if (nums[right] < nums[i]) {
                left--;
            }
        }
        for (int i = 0; i<nums.length-1; i++) {
            if (right==nums.length-1) break;
            if (nums[right+1] < nums[i] && i<right) {
                right++;
            }
        }
        //step3
        System.out.println(left);
        for (int i = nums.length-1; i>0; i--) {
            if (left==0) break;
            if (nums[left-1] > nums[i] && i>left) {
                left--;
                i++;
            }
        }
        for (int i = 0; i<nums.length-1; i++) {
            if (right==nums.length-1) break;
            if (nums[right+1] < nums[i] && i<right) {
                right++;
                i--;
            }
        }
        
        if (right == left) return 0;
        
        
        //step4
        for (int i = left-1; i>=0; i--) {
            if (nums[left] == nums[i]) left--;
        }
        
        for (int i = right+1; i<nums.length; i++) {
            if (nums[right] == nums[i]) right++;
        }
        System.out.println(left);
        System.out.println(right);
        return (right-left)+1;
    }
}
