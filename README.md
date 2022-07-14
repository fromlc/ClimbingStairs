## Climbing Stairs

Given a staircase of n steps which you can climb either one or two steps at a time, how many unique ways to climb all n steps? The order of steps matters.

This is [problem 70 on LeetCode.com][leetcode.com 70].

### Example 1

Input: n = 3, output = 3.

There are 3 unique ways to climb 3 steps:

1.1 step, 1 step, 1 step [1,1,1]
2. 1 step, 2 steps [1,2]
3. 2 steps, 1 step [2,1]

### Example 2

Input: n = 5, output = 8.

1. [1,1,1,1,1]
2. [1,1,1,2]
3. [1,1,2,1]
4. [1,2,1,1]
5. [2,1,1,1]
6. [1,2,2]
7. [2,1,2]
8. [2,2,1]

[leetcode.com 70]: https://leetcode.com/problems/climbing-stairs/