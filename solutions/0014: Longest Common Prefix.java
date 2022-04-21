class Solution {
    public String longestCommonPrefix(String[] strs) {
        String answer = "";
        for (int i = 0; i<strs[0].length(); i++) {
            char curchar = strs[0].charAt(i);
            for (int j = 0; j<strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != curchar) {
                    return answer;
                }
            }
            answer += curchar;
        }
        return answer;
    }
}
