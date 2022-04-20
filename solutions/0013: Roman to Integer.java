//can also be done with a hashmap to get a O(n) time complexity.
class Solution {
    public int romanToInt(String s) {
        int current, last, result;
        current = last = result = 0;
        for (int i = s.length()-1; i != -1; i--){       //iterate through the string backwards
            switch(s.charAt(i)) {                       //switch statement going through each letter and converting them to a number
                case 'I':
                    current = 1;
                    break;
                case 'V':
                    current = 5;
                    break;
                case 'X':
                    current = 10;
                    break;
                case 'L':
                    current = 50;
                    break;
                case 'C':
                    current = 100;
                    break;
                case 'D':
                    current = 500;
                    break;
                case 'M':
                    current = 1000;
                    break;
            }
            if (current >= last) {                //if the number we got from the switch statement is larger than our previous number, we add it to the result
                result += current;
            }
            else {
                result -= current;                //if the number is smaller it means we should substract it from the result instead.
            }
            last = current;
        }
        return result;
    }
}
