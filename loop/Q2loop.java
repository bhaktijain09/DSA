// Q2 of loop assignment - Write a program that reads a set of integers, and then prints the sum of the even and odd integers
package loop;
import java.util.*;
public class Q2loop {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sumEven = 0;
        int sumOdd = 0;

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
            i++;
        }

        System.out.println("Sum of even numbers = " + sumEven);
        System.out.println("Sum of odd numbers = " + sumOdd);
    }
}
