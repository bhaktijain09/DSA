//self made Question

package FunctionsMethods;

import java.util.Scanner;

public class AverageofNnumbers {
    public static double average(int n, Scanner sc){

        double sum=0;
      
for(int i=1; i<=n; i++){
     sum = sum + sc.nextDouble();
}
     return sum/n;
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the total number of inputs n to be entered:");
    int n = sc.nextInt();
    System.out.println("Enter the input numbers:");

    double result = average (n, sc);
    System.out.println(result);
}
    
    }


