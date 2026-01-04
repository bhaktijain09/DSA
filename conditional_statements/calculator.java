package conditional_statements;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a:");
        double a = sc.nextDouble();                   // takes value of a 

        System.out.println("Enter the value of b:");
        double b = sc.nextDouble();                   // takes value of b

        System.out.println("Enter the operator:");
        char operator = sc.next().charAt(0);   //char for symbols +,-,*,/,%  //sc.next takes a word, .charAt(0) takes 1st letter of that word
        
switch(operator){                //takes symbol +,-,*,/,% from operator to match with case listed below and give output 

case '+': System.out.println(a+b);     // operator = case = + , logic applied a+b
break;

case '-': System.out.println(a-b);     // operator = case = - , logic applied a-b
break;

case '*': System.out.println(a*b);     // operator = case = * , logic applied a*b
break;

case '/': 
           if (b == 0)
           {
           System.out.println("Division by zero not allowed");  //if b=0 result will be infinity so we did not allowed
           } 
           else 
           {
           System.out.println(a/b);     // operator = case = / , logic applied a/b
           }
break;

case '%': System.out.println(a%b);     // operator = case = % , logic applied a%b
break;

default: System.out.println("logic is not available");   // if none of the above cases applies, then deafult

        }

    }
}
