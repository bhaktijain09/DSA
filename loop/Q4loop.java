// Write a program to print the multiplication table of a number N, entered by the user. 

package loop;

import java.util.Scanner;

public class Q4loop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int integer = sc.nextInt();            // table of number eg-integer=3

        System.out.println("Enter how many times:");
        int times = sc.nextInt();    // max range ie till number of times, eg- till 10th if times=10....so print 3*1,3*2,...till 3*10

        if (times <= 0) {
            System.out.println("Invalid range");  // starts with 1, positive number of times
            sc.close();
            return;
        }

        for (int counter = 1; counter <= times; counter++) {
            System.out.println(integer + " x " + counter + " = " + (integer * counter));
        }

        sc.close();
    }
}


// same condition using while loop

// int counter = 1;
// while (counter <= times) {
//     System.out.println(integer + " x " + counter + " = " + (integer * counter));
//     counter++;
// }
