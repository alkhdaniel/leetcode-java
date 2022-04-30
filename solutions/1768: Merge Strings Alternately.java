/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.

Example 1:
Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r

Example 2:
Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s

Example 3:
Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d

Constraints:
1 <= word1.length, word2.length <= 100
word1 and word2 consist of lowercase English letters.
*/

class Solution {
    public String mergeAlternately(String word1, String word2) {
        String merged = "";
        if (word1.length()>word2.length()) {                        //if word1 is longer than word2
            for (int i = 0; i<word2.length(); i++) {                //iterate until the end of word2
                merged+=String.valueOf(word1.charAt(i));            //add word1 current char
                merged+=String.valueOf(word2.charAt(i));            //then word2 current char
            }
            for (int i = word2.length(); i<word1.length(); i++)     //then iterate through the rest of word1
                merged+=String.valueOf(word1.charAt(i));            //and add it to our merged string
        }
        else if (word2.length()>word1.length()) {                   //same as the first if statement, but word2 is longer than word1
            for (int i = 0; i<word1.length(); i++) {
                merged+=String.valueOf(word1.charAt(i));
                merged+=String.valueOf(word2.charAt(i));
            }
            for (int i = word1.length(); i<word2.length(); i++)
                merged+=String.valueOf(word2.charAt(i));
            }
        else {                                                      //the words are of equal length
            for (int i = 0; i<word1.length(); i++) {                //iterate through them
                merged+=String.valueOf(word1.charAt(i));            //and add them into our merged string
                merged+=String.valueOf(word2.charAt(i));
            }
        }
        return merged;
    }
}
