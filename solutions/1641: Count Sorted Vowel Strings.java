/*
Given an integer n, return the number of strings of length n that consist only of vowels (a, e, i, o, u) and are lexicographically sorted.
A string s is lexicographically sorted if for all valid i, s[i] is the same as or comes before s[i+1] in the alphabet.

Example 1:
Input: n = 1
Output: 5
Explanation: The 5 sorted strings that consist of vowels only are ["a","e","i","o","u"].

Example 2:
Input: n = 2
Output: 15
Explanation: The 15 sorted strings that consist of vowels only are
["aa","ae","ai","ao","au","ee","ei","eo","eu","ii","io","iu","oo","ou","uu"].
Note that "ea" is not a valid string since 'e' comes after 'a' in the alphabet.

Example 3:
Input: n = 33
Output: 66045

Constraints:
1 <= n <= 50 
*/

//solving the problem with recursion because thats what the monthly challenge wanted, this is an extremely slow solution

class Solution {
    int sum = 0;                                                          //our result
    public int countVowelStrings(int n) {
        String[] vowels = {"a","e","i","o","u"};                          //vowels to iterate through
        recursion(vowels, n, 0);                                          //start our recursion
        return sum;                                                       //return our result
    }
    private void recursion(String[] vowels, int n, int highest) {
        for (int i=0; i<vowels.length; i++) {                             //iterate through all our vowels
        if (highest<=i && n!=1) {                                          //highest stores our lexigraphically highest vowel we've iterated, if the vowel we iterate now is higher, then we do nothing
                recursion(vowels, n-1, Math.max(highest,i));              //continue the recursion if it isnt
            }
            else if (highest<=i && n==1) {                                 //if we're on the last recursion, start adding to our sum
                sum++;
            }
        }
    }
}
