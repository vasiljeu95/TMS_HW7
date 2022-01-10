# TMS_HW7

## ✅ Task A, Build Array from Permutation 
### Condition:
- Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
- A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

### Example 1:
- Input: nums = [0,2,1,5,3,4]
- Output: [0,1,2,4,5,3]
- Explanation: The array ans is built as follows: 
- ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    = [0,1,2,4,5,3]

### Example 2:
- Input: nums = [5,0,1,2,3,4]
- Output: [4,5,0,1,2,3]
- Explanation: The array ans is built as follows:
- ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
    = [4,5,0,1,2,3]
 
### Constraints:
- 1 <= nums.length <= 1000
- 0 <= nums[i] < nums.length
- The elements in nums are distinct.

## ✅ Task B, Concatenation of Array
### Condition:
- Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
- Specifically, ans is the concatenation of two nums arrays.
- Return the array ans.

### Example 1:
- Input: nums = [1,2,1]
- Output: [1,2,1,1,2,1]
- Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]

### Example 2:
- Input: nums = [1,3,2,1]
- Output: [1,3,2,1,1,3,2,1]
- Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]
 
### Constraints:
- n == nums.length
- 1 <= n <= 1000
- 1 <= nums[i] <= 1000

## ✅ Task C, Richest Customer Wealth
### Condition:
- You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i-th customer has in the j-th bank. 
- Return the wealth that the richest customer has.
- A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

### Example 1:
- Input: accounts = [[1,2,3],[3,2,1]]
- Output: 6
- Explanation:
- 1st customer has wealth = 1 + 2 + 3 = 6
- 2nd customer has wealth = 3 + 2 + 1 = 6
'Both customers are considered the richest with a wealth of 6 each, so return 6.'

### Example 2:
- Input: accounts = [[1,5],[7,3],[3,5]]
- Output: 10
- Explanation: 
- 1st customer has wealth = 6
- 2nd customer has wealth = 10 
- 3rd customer has wealth = 8
'The 2nd customer is the richest with a wealth of 10.'

### Example 3:
- Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
- Output: 17
 
### Constraints:
- m == accounts.length
- n == accounts[i].length
- 1 <= m, n <= 50
- 1 <= accounts[i][j] <= 100

## ✅ Task D, Kids With the Greatest Number of Candies
### Condition:
- There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
- Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
- Note that multiple kids can have the greatest number of candies.

### Example 1:
- Input: candies = [2,3,5,1,3], extraCandies = 3
- Output: [true,true,true,false,true] 
- Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.

### Example 2:
- Input: candies = [4,2,1,1,2], extraCandies = 1
- Output: [true,false,false,false,false] 
- Explanation: There is only 1 extra candy.
- Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.

### Example 3:
- Input: candies = [12,1,12], extraCandies = 10
- Output: [true,false,true]
 
### Constraints:
- n == candies.length
- 2 <= n <= 100
- 1 <= candies[i] <= 100
- 1 <= extraCandies <= 50
