// nums1 = [1,2,3]
// nums2 = [2,5,6]
// nums1.length = 6

package ArraysOne;
// nums1 initially contains m sorted elements followed by extra space
// nums1 = [1, 2, 3, 0, 0, 0]
// nums2 contains n sorted elements
// nums2 = [2, 5, 6]
// Total length of merged array = m + n = 6
// Merging is done in-place in nums1 from the end to avoid overwriting values

public class MergeAsc {
    public static void main(String[] args) {

        
        int[] nums1 = {1, 2, 3, 0, 0, 0}; // nums1 has extra space (0,0,0) to store merged elements
        int m = 3;   // number of valid elements in nums1

        int[] nums2 = {2, 5, 6};
        int n = 3;   // number of elements in nums2

        // i points to last valid element in nums1
        int i = m - 1;

        // j points to last element in nums2
        int j = n - 1;

        // k points to last position of merged array in nums1 of length 6
        int k = m + n - 1;

        // Merge nums1 and nums2, starting from the end
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
               // Print the merged sorted array
        for (int x : nums1) {
            System.out.print(x + " ");
        }
    }
}
        
// i = 2  → nums1[i] = 3   (last valid element in nums1)
// j = 2  → nums2[j] = 6   (last element in nums2)
// k = 5  → last index of nums1 
// 6>=0 yes then 2>=0 yes && 2>6 no so else 5th index is assigned value 6
// and the loop goes so on....


// Initial pointer values before the loop starts:
// i = 2 → nums1[i] = 3 (last valid element in nums1)
// j = 2 → nums2[j] = 6 (last element in nums2)
// k = 5 → last index of nums1 where the largest value will be placed

// Iteration 1:
// Compare nums1[i] = 3 and nums2[j] = 6
// Since 3 > 6 is false, place 6 at nums1[5]
// Decrement j and k

// Iteration 2:
// Compare nums1[i] = 3 and nums2[j] = 5
// Since 3 > 5 is false, place 5 at nums1[4]
// Decrement j and k

// Iteration 3:
// Compare nums1[i] = 3 and nums2[j] = 2
// Since 3 > 2 is true, place 3 at nums1[3]
// Decrement i and k

// Iteration 4:
// Compare nums1[i] = 2 and nums2[j] = 2
// Since 2 > 2 is false, place 2 at nums1[2]
// Decrement j and k

// Loop ends because j < 0 (nums2 is fully merged)
// Remaining elements in nums1 are already in correct order

