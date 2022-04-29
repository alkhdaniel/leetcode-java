/*
A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. Otherwise, return false.

Example 1:
Input: arr = [3,5,1]
Output: true
Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively, between each consecutive elements.

Example 2:
Input: arr = [1,2,4]
Output: false
Explanation: There is no way to reorder the elements to obtain an arithmetic progression.

Constraints:
2 <= arr.length <= 1000
-106 <= arr[i] <= 106
*/
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);                                     //first sort the array
        int difference=arr[1]-arr[0];                         //check the difference between the first and second index
        for (int i = 2; i<arr.length; i++) {                  //loop through the remaining indices
            if (arr[i]-arr[i-1] != difference) {              //if the difference between the next and previous index isnt the same, we return false
                return false;
            }
        }
        return true;                                          //return true if we didnt find an instance where the difference was different
    }
}
