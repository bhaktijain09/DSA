package FunctionsMethods;

import java.util.Scanner;

public class factorial_callbymethod {
    public static int factorial(int n){   // methodname is factorial and n is parameter
       int f=1; // initialized f=1
     
       for(int i=1; i<=n; i++){
        f = f * i;
       }
      return f;
    }

    
       public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of which you want factorial:");
       int n = sc.nextInt();

        int result = factorial(n);  // calling method and passing argument n
        System.out.println(result);
        sc.close();
       }
    }

// eg - n=4 then for 
// f_before=1, i=1, f_after = (f=f*i) = 1        //i=1; 1<=4,i++
// f_before=1, i=2, f_after = (f=f*i) = 2       //i=2; 2<=4,i++
// f_before=2, i=3, f_after = (f=f*i) = 6      //i=3; 3<=4,i++
// f_before=6, i=4, f_after = (f=f*i) = 24    //i=4; 4<=4,i++
// so 4! = n! = 24
// f_after of previous iteration is f_before of current iteration



