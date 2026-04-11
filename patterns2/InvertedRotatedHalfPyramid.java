//    *
//   **
//  ***
// ****

// 1st row n position
// 2nd row n, n-2 position
// 3rd row n, n-2, n-3 position
// 4th row n, n-2, n-3, n-4 position

// pseudocode - if for row=i=1, column=j=n-i

package patterns2;

import java.util.Scanner;

public class InvertedRotatedHalfPyramid {
    public static void pyramid(int n) {
     for(int i=1; i<=n; i++){ //outer loop is for no.of lines/rows in the pattern
         for(int j=1; j<=n-i; j++){ // inner loop is for no. of columns to be printed in each row
            System.out.print(" "); // what needs to be print in that column in each row(space here)
         }
         for(int j=1; j<=i; j++){ // inner loop is for no. of columns to be printed in each row
            System.out.print("*"); // what needs to be print (* here)
         }
          System.out.println(); // break to next line after each row
     }

    }

    public static void main(String[] args) {
        System.out.println("Enter the number of rows needed in pyramid:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        pyramid(n);
    }

}

// Check:
// i	     spaces(n-i)times                i times * continues after (n-i) times space

// 1	     3(1st,2nd,3rd position)	     1 time* after 3 spaces (4th position pe star)
// 2	     2(1st,2nd position)	         2 times* after 2 spaces (3rd, 4th position pe star)
// 3	     1(1st position)                 3 times* after 1 space (2nd, 3rd, 4th position pe star)
// 4	     0(no space)                     4 times* after 0 spaces (1st, 2nd, 3rd, 4th position pe star)