// leetcode 59 - You are given one integer n. You have to create an n × n matrix and fill it with numbers from 1 to n² in spiral order.

// Explaination - 
// You are given one integer n.
// Create an n × n matrix and fill it with numbers from 1 to n² in spiral order.

// Example: n = 3, Create a 3 × 3 matrix and insert numbers 1 to 9:
// 1  2  3
// 8  9  4
// 7  6  5
public class spiralMatrix2 {
    
    public int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];
        int startRow = 0;
        int endRow = n - 1;
        int startCol = 0;
        int endCol = n - 1;
        int num = 1;

        while (startRow <= endRow && startCol <= endCol) {

            for (int j = startCol; j <= endCol; j++) {
                matrix[startRow][j] = num++; 
//num++ is post-increment - uses current value first(num=1),then increases by 1(num=2),(num=3),..... 
            }
            for (int i = startRow + 1; i <= endRow; i++) {
                matrix[i][endCol] = num++;
            }
            if (startRow < endRow) {
            for (int j = endCol - 1; j >= startCol; j--) {
                matrix[endRow][j] = num++;
            }
            }
            if (startCol < endCol) {
            for (int i = endRow - 1; i > startRow; i--) {
                matrix[i][startCol] = num++;
            }
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return matrix;

    }

}
