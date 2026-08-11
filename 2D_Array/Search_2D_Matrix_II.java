public class Search_2D_Matrix_II {
    // class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int m = matrix.length;
//         int n = matrix[0].length;
//         for(int i=0; i<m; i++){
//             for(int j=0; j<n; j++){
//                 if(matrix[i][j] == target){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }

    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;
        
        // always initialize with 0th row and last column
        int i = 0; 
        int j = n - 1;


    // i < m because we move down using i++, so i must not go beyond the last row m. 
    // j >= 0 because we move left using j--, so j must not go beyond 0 ie become -1.
        while (i < m && j >= 0) {

            if (matrix[i][j] == target) {
                return true;
            }

            if (matrix[i][j] > target) {
                j--;        // move left
            } else {
                i++;        // move down
            }
        }

        return false;
    }
}
