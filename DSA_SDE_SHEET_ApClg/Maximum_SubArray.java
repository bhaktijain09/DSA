// Maximum Subarray - Kadane's Algorithm 
// Given an integer array nums, find the subarray with the largest sum, and return its sum.
// solution intuition - The intuition behind Kadane's Algorithm is simple:
// At every index(i), decide whether it is better to continue the current subarray(i=0.....to n) or start a new one(sum=0).


// Example 1:
// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.

// Example 2:
// Input: nums = [1]
// Output: 1
// Explanation: The subarray [1] has the largest sum 1.

// Example 3:
// Input: nums = [5,4,-1,7,8]
// Output: 23
// Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 

class Maximum_SubArray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){

            sum = sum + nums[i];
            if(sum > max_sum){
                max_sum = sum;
            }
            if(sum<0){
                sum = 0;
            }
            
        }
        return max_sum;
    }
}



