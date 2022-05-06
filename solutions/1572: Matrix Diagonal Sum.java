/*
Given a square matrix mat, return the sum of the matrix diagonals.
Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

Example 1:
Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.

Example 2:
Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8

Example 3:
Input: mat = [[5]]
Output: 5

Constraints:
n == mat.length == mat[i].length
1 <= n <= 100
1 <= mat[i][j] <= 100
*/

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;                              //our answer
        int n = mat.length;                       //how many rows/columns n in our matrix
        for (int i = 0; i<n; i++) {               //iterate through each rows/columns
            sum += mat[i][i];                     //this adds the values going diagonally from topleft to bottomright to our sum
            if (i!=n-i-1) sum += mat[n-i-1][i];   //this adds the values going diagonally from topright to bottomleft to our sum, making sure to not add a value we already added when going from topleft to bottomright
        }
        return sum;
    }
}
