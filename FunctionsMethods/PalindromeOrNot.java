package FunctionsMethods;
import java.util.*;
public class PalindromeOrNot {
    public static int palindrome(int n){

        int reverse = 0;

        while(n>0){
        int last_digit = n%10;
        reverse = reverse * 10 + last_digit;
        n = n/10;
        }
        return reverse;
    }

    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number n:");
    int n = sc.nextInt();
    int original = n;

    int result = palindrome(n);
    

    if(original == result){
        System.out.println(original + " is a Palindrome");
    }
    else{
            System.out.println(original + " is not a Palindrome");
    }
    }
   
}
