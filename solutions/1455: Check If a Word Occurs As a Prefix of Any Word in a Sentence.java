/*
Given a sentence that consists of some words separated by a single space, and a searchWord, check if searchWord is a prefix of any word in sentence.
Return the index of the word in sentence (1-indexed) where searchWord is a prefix of this word. If searchWord is a prefix of more than one word, return the index of the first word (minimum index). If there is no such word return -1.
A prefix of a string s is any leading contiguous substring of s.


Example 1:
Input: sentence = "i love eating burger", searchWord = "burg"
Output: 4
Explanation: "burg" is prefix of "burger" which is the 4th word in the sentence.

Example 2:
Input: sentence = "this problem is an easy problem", searchWord = "pro"
Output: 2
Explanation: "pro" is prefix of "problem" which is the 2nd and the 6th word in the sentence, but we return 2 as it's the minimal index.

Example 3:
Input: sentence = "i am tired", searchWord = "you"
Output: -1
Explanation: "you" is not a prefix of any word in the sentence.

Constraints:
1 <= sentence.length <= 100
1 <= searchWord.length <= 10
sentence consists of lowercase English letters and spaces.
searchWord consists of lowercase English letters.
*/
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");                                               //split the sentence into words
        for (int i = 0; i < words.length; i++) {                                            //iterate through all words
            for (int j = 0; j < Math.min(searchWord.length(), words[i].length()); j++){     //iterate through all characters in whichever is the shortest: searchword or word
                if (searchWord.charAt(j) == words[i].charAt(j)) {                           //if the character at index i of searchword matches the word
                    if (j == searchWord.length()-1) {                                       //if we are at the last character of the shortest of searchword or word
                        return i+1;                                                         //return the index+1 (since the question wants the word at index i starting at 1 and not 0)
                    }
                }
                else {
                    break;                                                                  //if the characters dont match we move on to the next word
                }
            }
        }
        return -1;
    }
}
