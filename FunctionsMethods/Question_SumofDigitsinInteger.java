// Write a Java method to compute the sum of the digits in an integer.
// (Hint: Approach this question in the following way: 
// a. Take a variable sum = 0 
// b. Find the last digit of the number
// c. Add it to the sum
// d. Repeat a & b until the number becomes 0 )

package FunctionsMethods;

import java.util.Scanner;

public class Question_SumofDigitsinInteger {
    public static int integer(int n) {
        int sum = 0; // declare sum and initialize sum=0;
        while (n > 0) {
            int last_digit = n % 10; // remainder
            sum = sum + last_digit;
            n = n / 10; // quotient
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = integer(n);
        System.out.println("The total sum of digits in the integer "+ n + " is " + result);

    }
}
