// how the isPrime(int n) method works

package FunctionsMethods;

public class Prime {
    public static boolean isPrime(int n){
// true  → n is prime
// false → n is not prime
        
        for (int i=2; i<=n-1; i++){  // Loop starts from 2 because 1 divides every number.It goes up to n-1, checking all possible divisors except 1 and n.
           if(n%i==0){
               return false;
// If any number divides n evenly, n is NOT prime.
// Method exits immediately.
           }
            }
            return true;
// If the loop finishes and no divisor was found,
// the number is considered prime and true is returned.
    }

    public static void main(String[] args){
       System.out.println(isPrime(8));
       
       }
}
