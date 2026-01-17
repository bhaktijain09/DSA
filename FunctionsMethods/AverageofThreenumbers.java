package FunctionsMethods;
import java.util.Scanner;

public class AverageofThreenumbers {
    public static double Average(double a, double b, double c){
        return (a+b+c) / 3;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of first number:");
        double a = sc.nextDouble();
          System.out.println("Enter the value of second number:");
         double b = sc.nextDouble();
           System.out.println("Enter the value of third number:");
          double c = sc.nextDouble();

        double result = Average(a,b,c);
        System.out.println("The average of the following three numbers are: "+ result);

        sc.close();
    }
}
