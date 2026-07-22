// Approach 1: Brute Force
// For every element, count its frequency by traversing the entire array.
// If frequency > n/2, return that element.

// Time Complexity: O(n²)
// Space Complexity: O(1)

class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int frequency = 0;

            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    frequency++;
                }
            }

            if (frequency > n / 2) {
                return nums[i];
            }
        }

        return -1;
    }
}

// Approach 2: Sorting
//
// 1. Sort the array.
// 2. Count the frequency of consecutive elements.
// 3. If any frequency > n/2, return that element.
//
// OR
//
// Since the problem guarantees a majority element exists,
// after sorting, simply return nums[n/2].
//
// Time Complexity: O(n log n)
// Space Complexity: Depends on sorting algorithm

import java.util.Arrays;
class Solution {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);

        return nums[nums.length / 2];
    }
}

// Approach 3: Boyer-Moore Voting Algorithm (Optimal)
//
// candidate = current majority candidate
// count = balance between candidate and all other elements
//
// If count becomes 0, choose the current element as the new candidate.
// If current element == candidate, increase count.
// Otherwise, decrease count.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int majorityElement(int[] nums) {

        int count = 0;
        int candidate = nums[0];

        for (int i = 0; i < nums.length; i++) {

            if (count == 0) {
                candidate = nums[i];
            }

            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}

// For interviews, also remember the HashMap approach because it's the natural improvement after brute force.

// HashMap approach:

// Store the frequency of every element in a HashMap.
// Return the element whose frequency becomes > n/2.

// Time Complexity: O(n)
// Space Complexity: O(n)


// Brute Force – O(n²)
// HashMap – O(n) time, O(n) space
// Sorting – O(n log n)
// Boyer-Moore Voting – O(n) time, O(1) space (optimal correct solution)


// "I would first think of the brute-force solution, but it takes O(n²) time because it repeatedly counts frequencies."
// "I can improve that using a HashMap, which stores frequencies in one pass and reduces the time to O(n), at the cost of O(n) extra space."
// "Another approach is sorting. After sorting, the majority element will occupy the middle position because it appears more than n/2 times. This takes O(n log n) time."
// "Since the follow-up asks for O(n) time and O(1) space, I would use the Boyer-Moore Voting Algorithm, which achieves the optimal time and space complexity."