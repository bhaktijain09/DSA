// optimal - Rotate Array

public class Rotate_array {
    public void reverse(int[] nums, int left, int right) {

        while (left < right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

    public void rotate(int[] nums, int k) {

        int n = nums.length;

        // Avoid unnecessary full rotations
        k = k % n;

        // Reverse entire array
        reverse(nums, 0, n - 1);

        // Reverse first k elements
        reverse(nums, 0, k - 1);

        // Reverse remaining elements
        reverse(nums, k, n - 1);
    }
}

// Brute force - 
class Solution {
    public void rotate(int[] nums, int k) {

    k = k % nums.length;

   while (k > 0) {

           // Store the last element before shifting
            int last_element = nums[nums.length - 1];
            
            for (int i = nums.length - 1; i >= 1; i--) {

                       nums[i] = nums[i - 1];

            }

            // Shift every element one position to the right
            // Start from the last index and stop at index 1.
            // We DO NOT go to index 0 because we copy nums[i - 1].
            // If i becomes 0, Java will try to access nums[-1],
            // which causes an ArrayIndexOutOfBoundsException.
             
        nums[0] = last_element; //Place the previously stored last element at the beginning
        k--; // One rotation completed
        }

    }
}

// why k = k % nums.length; ????

// if Array size = n, then for every n rotations, bring the array back to its original state.
// So only the remainder matters. That's why we write - k = k % n;
// eg - array size n = 5, array = {1,2,3,4,5} and no.of rotations k = 5 
// then for array size n after k rotations gives back original array. so no need to perform these many rotations when work can be reduced.
//eg - {1,2,3,4,5}original to {2,3,4,5,1}k=1 to {3,4,5,1,2}k=2 to {4,5,1,2,3}k=3 to 
//{5,1,2,3,4}k=4 to {1,2,3,4,5}k=5=original array 
// ie (k = k % nums.length)
// (5%5= 0 rotations ans is same as 5(k) rotations ans for 5(n) array size)
// (8%5= 3 rotations ans is same as 8(k) rotations ans for 5(n) array size)
