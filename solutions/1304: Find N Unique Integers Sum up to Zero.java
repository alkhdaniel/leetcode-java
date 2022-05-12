/*
Given an integer n, return any array containing n unique integers such that they add up to 0.

Example 1:
Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].

Example 2:
Input: n = 3
Output: [-1,0,1]

Example 3:
Input: n = 1
Output: [0]

Constraints:
1 <= n <= 1000
*/

class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];              //our answer
        if (n%2==0) {                           //we will handle things differently depending on if our input is even or odd
            for (int i = 1; i<n/2+1; i++) {     //iterate every 2nd n
                result[i*2-2] = i;              //for our first iteration, i*2-2 = 0, and we input 1 into it, for our second iteration i*2-2 = 2, and we input 2 into it
                result[i*2-1] = -i;             //for our first iteration, i*2-2 = 1, and we input -1 into it, for our second iteration i*2-2 = 3, and we input -2 into it
            }
        }
        else {
            result[0] = 0;                      //if n is odd, we can put 0 into the first index, and then basically use the same for loop as for the case when its even
            for (int i = 1; i<n/2+1; i++) {
                result[i*2-1] = i;
                result[i*2] = -i;
            }
        }
        return result;
    }
}
