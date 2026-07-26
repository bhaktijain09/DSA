public class Merge_two_sorted_array {
    public static void mergesort(int nums1[], int m, int nums2[], int n){
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


// Complexity - 
// Time Complexity: O(m + n)
// Each element from nums1 and nums2 is processed at most once.
// Space Complexity: O(1)
// Only three integer variables (i, j, index) are used.