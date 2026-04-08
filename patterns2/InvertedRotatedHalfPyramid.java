//    *
//   **
//  ***
// ****

// 1st row n position
// 2nd row n, n-2 position
// 3rd row n, n-2, n-3 position
// 4th row n, n-2, n-3, n-4 position

// pseudocode - if i=1, 

package patterns2;

import java.util.Scanner;

public class InvertedRotatedHalfPyramid {
    public static void pyramid(int n) {
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of rows needed in pyramid:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        pyramid(n);
    }

}
