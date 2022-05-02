/*
Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
Given a balanced string s, split it in the maximum amount of balanced strings.
Return the maximum amount of split balanced strings.

Example 1:
Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.

Example 2:
Input: s = "RLLLLRRRLR"
Output: 3
Explanation: s can be split into "RL", "LLLRRR", "LR", each substring contains same number of 'L' and 'R'.

Example 3:
Input: s = "LLLLRRRR"
Output: 1
Explanation: s can be split into "LLLLRRRR".

Constraints:
1 <= s.length <= 1000
s[i] is either 'L' or 'R'.
s is a balanced string.
*/
//I struggled with understanding the problem a little bit, basically what they are asking for is that you go through all characters from left to right and whenever there is an equal amount of R as there are L, you have an equal substring.

class Solution {
    public int balancedStringSplit(String s) {
        int ans, R, L;
        ans = R = L = 0;                      //we will store our answer, and how many R's/L's there is in the substring here
        
        for (int i = 0; i<s.length(); i++) {  //iterate through each character
            if (s.charAt(i) == 'R') R++;      //if its an R, we increment R
            else L++;                         //otherwise it's an L, so we increment L
            if (R==L) {                       //we found a balanced substring (amount of R equals L) 
                ans++;                        //increment our answer
                R=L=0;                        //reset our R and L before continuing to search for more balanced substrings
            }
        }
        return ans;
    }
}
