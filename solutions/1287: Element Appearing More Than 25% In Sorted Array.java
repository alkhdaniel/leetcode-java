/*
Given an integer array sorted in non-decreasing order, there is exactly one integer in the array that occurs more than 25% of the time, return that integer.

Example 1:
Input: arr = [1,2,2,6,6,6,6,7,10]
Output: 6

Example 2:
Input: arr = [1,1]
Output: 1

Constraints:
1 <= arr.length <= 104
0 <= arr[i] <= 105
*/

class Solution {
    public int findSpecialInteger(int[] arr) {
        double quarter = arr.length/4f;         //25% of our arr length
        int count = 1;                          //count how many consecutive numbers
        for (int i = 1; i<arr.length; i++) {    //iterate our array
            if (arr[i] == arr[i-1]) count++;    //increment count if we have a consecutive number
            else count=1;                       //otherwise reset the count
            if (count>quarter) return arr[i];   //once our count is above 25%, we return the number at our current position
        }
        return arr[0];                          //nothing found, return the first index in the array
    }
}
