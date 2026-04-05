// Question 4 :READ & CODE EXERCISE Search about(Google) & use the following methods of the Math class in Java:
// a. Math.min( ) 
// b. Math.max( )
// c. Math.sqrt( ) 
// d. Math.pow( )
// e. Math.avg( )
// f. Math.abs( )

package FunctionsMethods;

import java.util.Scanner;

public class Question_MathClass {

    public static void number(double a, double b) {
        double min = Math.min(a, b);
        double max = Math.max(a, b);
        double sqrtA = Math.sqrt(a);
        double sqrtB = Math.sqrt(b);
        double pow = Math.pow(a, b);
        double avg = (a + b) / 2;
        double abs = Math.abs(a - b);

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Square root of a: " + sqrtA);
        System.out.println("Square root of b: " + sqrtB);
        System.out.println("a raised to b: " + pow);
        System.out.println("Average: " + avg);
        System.out.println("Absolute difference: " + abs);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        number(a, b);
    }
}

// double min = Math.min(a,b);
// double max = Math.max(a,b);
// double sqrt = Math.sqrt(a);
// double pow = Math.pow(a,b);

// double avg = Math.avg(); // there is no avg Math method in java, to find avg
// you have to do (a+b)/2 or (a+b+...)/n

// double abs = Math.abs(a); // absolute gives only positive number 
// ie changes: -5 to +5, +5 to +5 only, 0 to 0 only
// absolute is useful when calculating difference such as distance, when we do
// not know which one is bigger since distance cannot be negative.
// eg -
// normally
// int x = 5;
// int y = 12;
// int distance;
// if (x > y) {
// distance = x - y;
// } else {
// distance = y - x;
// }

// using Math.abs() -
// int x = 5;
// int y = 12;
// int distance = Math.abs(x - y); // if it does 5-12 = -7 but Math.abs(-7) = 7
// so dist is positive
// System.out.println(distance); // 7
