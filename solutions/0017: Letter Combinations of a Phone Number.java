/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

Example 1:
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

Example 2:
Input: digits = ""
Output: []

Example 3:
Input: digits = "2"
Output: ["a","b","c"]

Constraints:
0 <= digits.length <= 4
digits[i] is a digit in the range ['2', '9'].
*/

class Solution {
    public List<String> letterCombinations(String digits) {
        int n = digits.length();                                                            
        String[] map = { "0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz" };       //array of possible letters for each digit
        List<String> combinations = new ArrayList<>();                                      //we store our result here (the possible combinations given digits)
        recursive(digits, combinations, map, "", 0, n);                                     //start our recursive function
        return combinations;
    }
    private void recursive(String digits, List<String> combinations, String[] map, String combinationString, int pointer, int n) {
        if (digits == null || digits.length() == 0) {                                                       //make sure we werent handed an empty string
            return;
        }
        if (n==pointer) {                                                                                   //we've reached the last digit, add the string to our combinations
            combinations.add(combinationString);
            return;
        }
        int digit = digits.charAt(pointer) - '0';                                                           //gets the current digit we are on
        for (int i = 0; i<map[digit].length(); i++) {                                                       //iterate through the possible letters of our current digit
            recursive(digits, combinations, map, combinationString+map[digit].charAt(i), pointer + 1, n);   //recursively append each possible letter to the end of our combinationstring and re-run the function until we reach the last digit
        }
        return;
    }
}
