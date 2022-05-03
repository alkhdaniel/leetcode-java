/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order. 

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Constraints:
1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
*/
class Solution {
    public boolean isValid(String s) {
        int open = 0;                                             //store how many brackets are currently opened
        int[] lastopened = new int[10000];                        //store what bracket was opened last
        for (int i = 0; i<s.length(); i++) {                      //iterate characters in our string
            switch(s.charAt(i)) {
                case '(':
                    open++;                                       //increment our open int
                    lastopened[open]=1;                           //save that the last opened character was "("
                    break;
                case ')':
                    if (lastopened[open] != 1) return false;      //check if the last opened character was "(" or not: if it wasnt, then we are closing in the wrong order
                    open--;                                       //if the last opened character was "(", we decrement open so we can tell what was opened before
                    break;
                case '{':
                    open++;
                    lastopened[open]=2;
                    break;
                case '}':
                    if (lastopened[open] != 2) return false;
                    open--;
                    break;
                case '[':
                    open++;
                    lastopened[open]=3;
                    break;
                case ']':
                    if (lastopened[open] != 3) return false;
                    open--;
                    break;
            }
        }
        if (open != 0) return false;
        return true;
    }
}
