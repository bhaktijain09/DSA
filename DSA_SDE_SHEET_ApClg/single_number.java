public class single_number {
    
    public int singleNumber(int[] nums) {

        int ans = 0; // Initialize result to 0

        // XOR all elements.
        // Properties of XOR:
        // 1. x ^ x = 0  (same numbers cancel each other)   // Every duplicate pair becomes 0.
        // 2. x ^ 0 = x  (XOR with 0 gives the same number)   // Only the number that appears once remains.
        // 3. XOR is commutative and associative,
        //    so the order of operations doesn't matter.

        for (int element : nums) {
            ans ^= element;   // Same as: ans = ans ^ element
        }
 
        // After all pairs cancel out, only the single number remains.
        return ans;
    }
}