/*
You are given an array rectangles where rectangles[i] = [li, wi] represents the ith rectangle of length li and width wi.
You can cut the ith rectangle to form a square with a side length of k if both k <= li and k <= wi. For example, if you have a rectangle [4,6], you can cut it to get a square with a side length of at most 4.
Let maxLen be the side length of the largest square you can obtain from any of the given rectangles.
Return the number of rectangles that can make a square with a side length of maxLen.

Example 1:
Input: rectangles = [[5,8],[3,9],[5,12],[16,5]]
Output: 3
Explanation: The largest squares you can get from each rectangle are of lengths [5,3,5,5].
The largest possible square is of length 5, and you can get it out of 3 rectangles.

Example 2:
Input: rectangles = [[2,3],[3,7],[4,3],[3,7]]
Output: 3

Constraints:
1 <= rectangles.length <= 1000
rectangles[i].length == 2
1 <= li, wi <= 109
li != wi
*/

class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int maxLen = 0;                                                           //the side of the largest square we can make
        int ans = 1;                                                              //amount of rectangles that can make the same sized square
        
        for (int[] rectangle:rectangles) {                                        //iterate through the rectangles
            if (rectangle[0] > maxLen && rectangle[1] > maxLen) {                 //we found a new largest square
                ans = 1;                                                          //reset answer back to 1
                if (rectangle[0]>rectangle[1]) maxLen = rectangle[1];             //store our shortest side of the rectangle in maxLen, faster than Math.min()
                else maxLen = rectangle[0];
            }
            else if (rectangle[0] >= maxLen && rectangle[1] >= maxLen) ans++;     //we found an equally large square; increment our answer.
        }
        
        return ans;
    }
}
