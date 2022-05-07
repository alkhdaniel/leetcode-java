/*
Given an array of n integers nums, a 132 pattern is a subsequence of three integers nums[i], nums[j] and nums[k] such that i < j < k and nums[i] < nums[k] < nums[j].
Return true if there is a 132 pattern in nums, otherwise, return false.

Example 1:
Input: nums = [1,2,3,4]
Output: false
Explanation: There is no 132 pattern in the sequence.

Example 2:
Input: nums = [3,1,4,2]
Output: true
Explanation: There is a 132 pattern in the sequence: [1, 4, 2].

Example 3:
Input: nums = [-1,3,2,0]
Output: true
Explanation: There are three 132 patterns in the sequence: [-1, 3, 2], [-1, 3, 0] and [-1, 2, 0].
 

Constraints:
n == nums.length
1 <= n <= 2 * 105
-109 <= nums[i] <= 109
*/

class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        int k = -1;                                                     
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = n-1; i>=0; i--) {                                   //iterate the array backwards, our i first acts as k, then as j, then as i (it might help to read this for loop from the bottom up to understand)
        
            if (k>-1 && nums[k] > nums[i]) {                            //first check if we have a k, then checks if nums[k]>nums[i] ("step 3")
                return true;                                            //return true if nums[k]>nums[i], because we know nums[j]>nums[k] from our while loop (check next line)
            }
            
            while (!stack.isEmpty() && nums[i]>nums[stack.peek()]) {    //check if nums[j]>nums[k] ("step 2")
                k = stack.pop();                                        //if it is, we get our k
            }
            
            stack.push(i);                                              //push k into the stack ("step 1")
        }
        return false;
    }
}
