/*
A pangram is a sentence where every letter of the English alphabet appears at least once.
Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

Example 1:
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.

Example 2:
Input: sentence = "leetcode"
Output: false

Constraints:
1 <= sentence.length <= 1000
sentence consists of lowercase English letters.
*/

class Solution {
    public boolean checkIfPangram(String sentence) {
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "u", "v", "w", "x", "y", "z"};    //the alphabet
        for (String letter:alphabet) {                          //iterate all letters in the alphabet
            if (!sentence.contains(letter)) return false;       //if our sentence doesnt contain a letter, we return false
        }
        return true;                                            //if sentence contained all leters, we return true
        
    }
}
