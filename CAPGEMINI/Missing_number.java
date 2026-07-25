import java.util.HashSet;

public class Missing_number {
    public int missingNumber(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) { // Store all elements of the array in the HashSet
            set.add(nums[i]);
        }

        for (int i = 0; i <= n; i++) { // Check every number from 0 to n

            if (!set.contains(i)) { // If the current number is not present in the set,
                return i; // then it is the missing number.
            }
        }

        return -1; // This line is never reached for valid input.
    }
}