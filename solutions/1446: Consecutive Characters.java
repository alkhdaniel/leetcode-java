/*
The power of the string is the maximum length of a non-empty substring that contains only one unique character.
Given a string s, return the power of s.

Example 1:
Input: s = "leetcode"
Output: 2
Explanation: The substring "ee" is of length 2 with the character 'e' only.

Example 2:
Input: s = "abbcccddddeeeeedcba"
Output: 5
Explanation: The substring "eeeee" is of length 5 with the character 'e' only.

Constraints:
1 <= s.length <= 500
s consists of only lowercase English letters.
*/
class Solution {
    public int maxPower(String s) {
        int longest = 1;
        int currentlength = 1;
        char currenchar = s.charAt(0);
        for (int i = 1; i<s.length(); i++){                         //iterate all characters
            if (s.charAt(i)==s.charAt(i-1)) {                       //if the current character matches the preceeding one
                currentlength++;                                    //add 1 to length
                if (currentlength>longest) longest=currentlength;   //and replace longest with currentlength if its a new record
            }
            else currentlength=1;                                   //otherwise put currentlength back to 1
        }
        return longest;
    }
}
