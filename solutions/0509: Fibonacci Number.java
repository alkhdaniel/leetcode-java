/*
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).

Example 1:
Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

Example 2:
Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.

Example 3:
Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.

Constraints:
0 <= n <= 30
/*
class Solution {
    public int fib(int n) {
        if (n==0) return 0;             //F(0) = 0
        int[] fib = new int[n+1];       //we'll store fib numbers here
        fib[1]=1;                       //F(1) = 1
        for (int i = 2; i<=n; i++) {    //iterate all fib numbers from 2 to (and including) n
            fib[i]=fib[i-1]+fib[i-2];   //our i'th fib number is the sum of our i'th-1 and i'th-2 fib number
        }
        return fib[n];
    }
}
