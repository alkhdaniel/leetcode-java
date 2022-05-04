/*
You are given an integer array nums and an integer k.
In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
Return the maximum number of operations you can perform on the array.

Example 1:
Input: nums = [1,2,3,4], k = 5
Output: 2
Explanation: Starting with nums = [1,2,3,4]:
- Remove numbers 1 and 4, then nums = [2,3]
- Remove numbers 2 and 3, then nums = []
There are no more pairs that sum up to 5, hence a total of 2 operations.

Example 2:
Input: nums = [3,1,3,4,3], k = 6
Output: 1
Explanation: Starting with nums = [3,1,3,4,3]:
- Remove the first two 3's, then nums = [1,4,3]
There are no more pairs that sum up to 6, hence a total of 1 operation.

Constraints:
1 <= nums.length <= 105
1 <= nums[i] <= 109
1 <= k <= 109
*/

class Solution {
    public int maxOperations(int[] nums, int k) {
        int ans = 0;                                                        //answer that we return
        HashMap<Integer,Integer> map = new HashMap<>();                     //will store how many of each number we have
        for (int num:nums) {                                                //iterate through all nums
            if (map.containsKey(k-num) && map.get(k-num) > 0) {             //check if our hashmap contains the number we need to add up to k
                ans++;                                                      //increment answer if we can add up to k
                map.put(k-num, map.get(k-num)-1);                           //and decrement the number we used to add up to k from the hashmap
            }
            else {
                map.put(num, map.getOrDefault(num,0)+1);                    //if no match was found, we put the number into our hashmap so that the next iteration can check against it
            }
        }
        return ans;
    }
}
