/*
Given an integer number n, return the difference between the product of its digits and the sum of its digits.

Example 1:
Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15

Example 2:
Input: n = 4421
Output: 21
Explanation: 
Product of digits = 4 * 4 * 2 * 1 = 32 
Sum of digits = 4 + 4 + 2 + 1 = 11 
Result = 32 - 11 = 21

Constraints:
1 <= n <= 10^5
*/
class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;              //we initialize our product to 1 (because multiplying by 0 would yield 0)
        int sum = 0;                  //initialize sum to 0
        while (n > 0) {               //while there are still digits to go through in n
            product*=n%10;            //n%10 gives us the last digit of n, so we do product * that
            sum+=n%10;                //n%10 gives us the last digit of n, so we do sum + that
            n/=10;                    //divide n by 10 to get rid of the last digit
        }
        return product-sum;           //return the difference between product and sum, sum can never be larger than product so simply doing product-sum is enough
    }
}
