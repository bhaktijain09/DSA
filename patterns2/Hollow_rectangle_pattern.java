// print hollow rectangle pattern 4 rows x 5 columns
// *****
// *   *
// *   *
// *****

package patterns2;

import java.util.Scanner;

public class Hollow_rectangle_pattern {
    // here we can notice a pattern that all the stars are printed in 1st row, 1st
    // column, 4th row, 5th column
    // solution logic - if 1st row, 1st column, 4th row, 5th column then print *
    // else print space, consider i=row, j=column, m=totalRow, n=totalColumn
    public static void dimensions(int m, int n) {

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == m || j == 1 || j == n) {
                    System.out.print("*"); // print, not println
                } else {
                    System.out.print(" "); // print, not println
                }
            }
            System.out.println(); // move to next line AFTER one row
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of m:");
        int m = sc.nextInt();
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        dimensions(m, n);    // passed arguments

    }

}
