// Write a program to find the factorial of any number entered by the user.
// (Hint:factorial of a number n = n*(n-1)*(n-2)*(n-3)*......*1 and exists for positive numbers only. 
// We write factorial as n! So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on. 
// Note - Please do not confuse factorial with NOT EQUAL TO operator, they are not the same)

package loop;

import java.util.Scanner;

public class Q3loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        int factorial = 1;
        for(int i=1; i<=number; i++){
         factorial = factorial * i;
        }

         System.out.println(factorial); 
        }

    
     }



// | Iteration | i | factorial (before) | factorial = factorial × i | factorial (after) |
// | --------- | - | ------------------ | ------------------------- | ----------------- |
// | Start     | – | 1                  | –                         | 1                 |
// | 1         | 1 | 1                  | 1 × 1                     | 1                 |
// | 2         | 2 | 1                  | 1 × 2                     | 2                 |
// | 3         | 3 | 2                  | 2 × 3                     | 6                 |
// | 4         | 4 | 6                  | 6 × 4                     | 24                |
// | 5         | 5 | 24                 | 24 × 5                    | 120               |



// Iteration-wise explanation
//  Before loop

// i = 1
// factorial = 1

//  Iteration 1
// i = 1                     
// factorial = 1 × 1 = 1           // factorial = factorial * i
// i becomes 2                     // i increases by 1 and "previous factorial result" is used as "factorial for multiplication" in current iteration to get new "factorial result" 

//  Iteration 2
// i = 2
// factorial = 1 × 2 = 2            // factorial = factorial * i
// i becomes 3                      // i increases by 1 and "previous factorial result" is used as "factorial for multiplication" in current iteration to get new "factorial result" 

//  Iteration 3
// i = 3
// factorial = 2 × 3 = 6              // factorial = factorial * i
// i becomes 4                       // i increases by 1 and "previous factorial result" is used as "factorial for multiplication" in current iteration to get new "factorial result" 

//  Iteration 4
// i = 4
// factorial = 6 × 4 = 24           // factorial = factorial * i
// i becomes 5                     // i increases by 1 and "previous factorial result" is used as "factorial for multiplication" in current iteration to get new "factorial result" 

//  Iteration 5
// i = 5
// factorial = 24 × 5 = 120         // factorial = factorial * i
// i becomes 6                      // i increases by 1 and "previous factorial result" is used as "factorial for multiplication" in current iteration to get new "factorial result" 

//  Loop stops

// Condition: 6 <= 5  → loop ends

