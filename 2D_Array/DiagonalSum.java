public class DiagonalSum {
    
    public int diagonalSum(int[][] mat) {

        int n = mat.length;
        int sum = 0;

        // Only i loop is needed:
        // Main diagonal - mat[i][i]
        // Secondary diagonal - mat[i][n - 1 - i]
        // No j loop is needed because we directly know the column positions
        // of both diagonals: mat[i][i] and mat[i][n - 1 - i] using i itself.
        for (int i = 0; i < n; i++) {
            sum += mat[i][i]; // diagonal sum
            sum += mat[i][n - 1 - i]; // secondary diagonal sum
        }

        // For odd n, the middle element belongs to both diagonals,
        // so it was added twice. Remove it once.
        if (n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }
        // eg - n=5 , n/2 = 5/2 = 2
        // so mat[2][2] is the center element in 5*5 matrix since elements starts from 0 to 4
        // (0,0)  (0,1)  (0,2)  (0,3)  (0,4)
        // (1,0)  (1,1)  (1,2)  (1,3)  (1,4)
        // (2,0)  (2,1)  (2,2)  (2,3)  (2,4)
        // (3,0)  (3,1)  (3,2)  (3,3)  (3,4)
        // (4,0)  (4,1)  (4,2)  (4,3)  (4,4)

        return sum;
    }
}
