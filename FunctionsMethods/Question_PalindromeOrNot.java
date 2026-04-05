package FunctionsMethods;

import java.util.Scanner;

public class Question_PalindromeOrNot {
    public static int palindrome(int n) { // n is the value we will enter to check if it is palindrome or not
        int reverse = 0;

        while (n > 0) {
            int last_digit = n % 10; // n%10 gives remainder ie last digit
            reverse = (reverse * 10) + last_digit;
            n = n / 10; // n/10 gives quotient ie roundoff number after removing last digit
        }
        return reverse;
    }

    public static void main(String[] args) {

        System.out.println("enter the number n:");
        Scanner sc = new Scanner(System.in); // taking number from user
        int n = sc.nextInt(); // storing user's number in n variable

        int result = palindrome(n); // final value of reverse is stored in result which is called by function(palindrome(n)) defined above and passing (n) value in it 
        int original = n; // original value of n before iterations is stored in original variable

        if (original == result) {
            System.out.println(original + " is a palindrome!");
        } else {
            System.out.println(original + " is not a palindrome!");
        }

    }
}