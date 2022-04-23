/*
Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.
Return the largest lucky integer in the array. If there is no lucky integer return -1.

Example 1:
Input: arr = [2,2,3,4]
Output: 2
Explanation: The only lucky number in the array is 2 because frequency[2] == 2.

Example 2:
Input: arr = [1,2,2,3,3,3]
Output: 3
Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.

Example 3:
Input: arr = [2,2,2,3,3]
Output: -1
Explanation: There are no lucky numbers in the array. 

Constraints:
1 <= arr.length <= 500
1 <= arr[i] <= 500
*/

class Solution {
    public int findLucky(int[] arr) {
        int[] counter = new int[500];                   //initialize the array where we store how many times a number shows up
        int luckyNumber = -1;                           //our lucky number, -1 if no lucky number is found
        for (int i = 0; i<arr.length; i++) {
            counter[arr[i]] += 1;                       //add 1 to the counter at index position arr[i]
        }
        for (int i = 1; i<counter.length; i++) {        //iterate through our counter array
            if(counter[i] == i) {                       //if the index of our counter equals the value at that index, we have a lucky number
                luckyNumber = i;                        //since we're going from 1 to 500, we will always store the highest lucky number
            }
        }
        return luckyNumber;
    }
}
