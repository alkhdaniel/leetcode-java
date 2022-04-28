/*
Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

Example 1:
Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.

Example 2:
Input: grid = [[3,2],[1,0]]
Output: 0

Constraints:
m == grid.length
n == grid[i].length
1 <= m, n <= 100
-100 <= grid[i][j] <= 100

Follow up: Could you find an O(n + m) solution?
*/

class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;                                      //this will store the count of negative numbers
        for (int m = 0; m < grid.length; m++) {             //iterate rows
            for (int n = 0; n < grid[m].length; n++) {      //iterate columns
                if (grid[m][n] < 0) {                       //check if index is negative or not
                    count++;                                //add it to the count if its negative
                }
            }
        }
        return count;
    }
}
