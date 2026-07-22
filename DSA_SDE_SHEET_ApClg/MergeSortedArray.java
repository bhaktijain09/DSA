// Interview Explanation
// If asked "Why do we start from the end?"

// answer: 
//"The valid elements of nums1 are at the beginning, and it has extra space at the end. 
// If I merge from the front, I'd overwrite values in nums1 before comparing them. 
// By starting from the end, I always place the larger element into free space, so no useful data is lost."
// This is the key insight behind the algorithm.

// Approach/pattern- Two pointer

// Example 1:

// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

import java.util.Scanner;

public class MergeSortedArray {
    public void mergeSort(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // start iteration from Last valid element of nums1
        int j = n - 1;  // start iteration from Last valid element of nums2
        int index = m + n - 1;  // Last index of merged array (nums1)

        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[index] = nums1[i];
                index--;
                i--;
            } else {
                nums1[index] = nums2[j];
                index--;
                j--;
            }
        }

        while (j >= 0) {
            nums1[index] = nums2[j];
            index--;
            j--;
        }
    }
}