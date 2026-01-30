package FunctionsMethods;

import java.util.*;

public class primeinrangeself {
    public static boolean isPrime(int n){
        if(n<=1){               // since 1 number is not prime so eliminates it
            return false;
        }
        
            for(int i=2; i<=Math.sqrt(n); i++){   // checks logic for 2 to n-1
              if( n%i==0){
                return false;   // if divides by number between 2 to n-1 then not unique, false ie not prime
              } 
            }
            return true;  // if does not divide by number between 2 to n-1 then unique means true ie prime
    }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
             boolean result = isPrime(n); // whether true or false is stored in result

            if(n<1 || n>100){   // excludes range <=1 or >100 as out of range
                System.out.println(n + " is out of range");
            }
            else{   // now the number is non negative, not 1, and not out of range so in range of 2 to 100
              
               if(result == true){    
                System.out.println(n + " is a prime number");
               } 
               else{
                System.out.println(n + " is not a prime number");
               }
            }
        }
    }


    // case- when we put 1 as input.
    // it shows output = out of range and not about prime or not since our concern is with the range and then prime or not.
    // if not within range so no concern if prime or not.