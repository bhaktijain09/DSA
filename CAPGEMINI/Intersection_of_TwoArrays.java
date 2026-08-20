import java.util.HashSet;

public class Intersection_of_TwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    set.add(nums1[i]);
                }
            }
        }

        // result array has element called result[k], set has element called num

        int[] result = new int[set.size()]; // result is the new array
        int k = 0;
        for (int num : set) { // num is the current element from the set
            result[k] = num; // put the set element into the result array
            k++;

        }

        return result;

    }
} 