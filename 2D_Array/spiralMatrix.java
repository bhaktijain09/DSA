import java.util.*;
public class spiralMatrix {
    public static void printSpiralMatrix(int matrix[][]){
        int m = matrix.length; // row length
        int n = matrix[0].length; // column length
        int startRow = 0;
        int endRow = m-1;
        int startCol = 0;
        int endCol = n-1;
       
        while(startRow<=endRow && startCol<=endCol){

        // for 1 2 3 4 - startRow(i) is fixed, startCol to endCol iterates(j iterates)
        for(int j=startCol; j<=endCol; j++){
            System.out.print(matrix[startRow][j] + " "); // startRow fixed, (j)column iterates
        }

        // for 8 12 16 vertically downside - endCol(j) is fixed, startRow+1 to endRow iterates(j iterates)
        for(int i=startRow+1; i<=endRow; i++){
            System.out.print(matrix[i][endCol] + " "); // endCol fixed, (i)row iterates
        }

         // for 15 14 13 - endRow(i) is fixed, endCol-1 to startCol iterates(j iterates)
         if (startRow < endRow){
        for(int j=endCol-1; j>=startCol; j--){
            System.out.print(matrix[endRow][j] + " "); // endRow fixed, (j)column iterates
        }
    }

          // for 9 5 vertically upside - startCol(j) is fixed, endRow-1 to startRow+1 iterates(j iterates)
          if (startCol < endCol){
        for(int i=endRow-1; i>startRow; i--){
            System.out.print(matrix[i][startCol] + " "); // startCol fixed, (i)row iterates
        }
    }

        startRow++;
        endRow--;
        startCol++;
        endCol--;


    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[4][4];
        int m = matrix.length;
        int n = matrix[0].length;
         System.out.println("Enter the elements to be inserted inside the matrix: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
               
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        printSpiralMatrix(matrix);
        sc.close();
    }
    
    
}
    
