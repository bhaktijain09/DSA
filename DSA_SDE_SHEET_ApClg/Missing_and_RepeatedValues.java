import java.util.HashSet;

class Missing_and_RepeatedValues {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        HashSet<Integer> set = new HashSet<>();
        int arr[] = new int[2]; // answer array where arr[0] = a = repeated, arr[1] = b = missing
        int n = grid.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (set.contains(grid[i][j])) {
                    arr[0] = grid[i][j];
                } else {
                    set.add(grid[i][j]);
                }
            }
        }
        for (int i = 1; i <= n * n; i++) {
            if (!set.contains(i)) {
                arr[1] = i;

            }
        }
        return arr;
    }
}