package loop;

import java.util.Scanner;

public class PrimeorNotLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<=1){
            System.out.println(n+ " is not a prime number"); 
            return;
        }
    
       
       

        boolean isPrime = true;       // datatype variable value (format)
        for(int i=2; i<=n-1; i++){   // so now i is not 1 and n
        if(n%i==0){                  // A number is prime if it has exactly two divisors: 1 and itself.
           isPrime = false;          // If it has any other divisor, it is not prime.
           break;                   // no point checking further
        }
    }

        if(isPrime){
        System.out.println(n + " is a prime number");
        }
        else{
        System.out.println(n + " is a not prime number");
        }

    }
}


// Take a number n
// Assume it is prime
// Try dividing it by numbers from 2 to n-1
// If any number(2 to n-1) divides it(n) completely(n%i==0) - then not prime
// If none do - prime  (ie it divides by 1 and n itself which is not in range in for loop)
