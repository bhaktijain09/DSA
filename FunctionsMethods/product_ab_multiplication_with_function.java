// product a & b lecture

package FunctionsMethods;

import java.util.Scanner;

public class product_ab_multiplication_with_function {
    public static int multiply(int a , int b){ // multiply = method name, int a and int b = formal parameters
        int product = a * b;  //logic
        return product;  //returns product to the calling method
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a:");  
    int a = sc.nextInt();                          //taking input value for a 
    System.out.println("Enter the value of b:");  
    int b = sc.nextInt();                         //taking input value for b
    int prod = multiply(a,b);     // calling method multiply, passing arguments(a,b) and storing the returned value in prod
    System.out.println("The value of multiplication of a and b is: " + prod); //print the prod value obtained

    prod = multiply (10, 20);   //calling method and passing literal values
    System.out.println("The value of multiplication of a and b is: " + prod);
    sc.close();

    }

}



// using directly declared a,b values int a = 3, int b = 5  (from apna college)

// package FunctionsMethods;

// public class product_ab_multiplication_with_function{
//     public static int multiply (int a, int b){  // multiply is methodname and int a, int b are parameters
//         int product = a * b;  //logic
//         return product;   //returns product to the calling method
//     }

//         public static void main(String[] args){
//             int a = 3; //using directly declared a,b values int a = 3, int b = 5  
//             int b = 5;  
//             int prod = multiply (a, b);   // calling method and passing arguments a,b
//             System.out.println("a*b = " + prod);

//             prod = multiply (10, 20);   //calling method and passing literal values
//             System.out.println("a*b = " + prod);
//         }
//     }




