public class Xmatrix {
    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j || i + j == n - 1) { //diagonal or secondary diagonal elements
                    if (grid[i][j] == 0) { //should be non-zero but if zero then return false
                        return false;
                    }
                } 
                else { // non-diagonal elements
                    if (grid[i][j] != 0) { //should be zero but if non-zero then return false
                        return false;
                    }
                }
            }
        }
        return true; //otherwise true
    }
}
// Time: O(n²)
// Space: O(1) {
    
//Diagonal and secondary diagonal elements logic -
// (0,0) (0,1) (0,2)
// (1,0) (1,1) (1,2)
// (2,0) (2,1) (2,2)

// Here i==j -> (0,0) (1,1) (2,2) //Diagonal elements logic 
// i+j == n-1 -> (0,2) (1,1) (2,0) //Secondary diagonal elements logic 

// X matrix means - 
// diagonal and Secondary diagonal elements should be non-zero, IF NOT RETURN FALSE
// non-diagonal elements should be zero, IF NOT RETURN FALSE
// X 0 X
// 0 X 0
// X 0 X