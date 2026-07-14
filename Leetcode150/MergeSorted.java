package Leetcode150;
import java.util.Arrays;
public class MergeSorted {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int index = m+n-1;
        int i = m-1;
        int j = n-1;
        while(i>=0 && j>=0){
            if(nums1[i] >= nums2[j]){
            nums1[index] = nums1[i];
            index--;
            i--;
        } 
        else{
            nums1[index] = nums2[j];
            index--;
            j--;
        } 
      
    }
      while(j>=0){
            nums1[index] = nums2[j];
            index--;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
       int[] nums2 = {2,5,6};
        int n = 3;
     merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}



// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.