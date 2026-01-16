// Binomial coefficient formula - nCr = n! /(r! * (n-r)!)

package FunctionsMethods;

import java.util.Scanner;

public class BinomialCoefficient {

    public static int factorial(int n){

    int f=1;
    int i;

    for(i=1; i<=n; i++){
        f = f * i;
    }
        return f;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the value of r:");
        int r = sc.nextInt();

        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

    int nCr = fact_n / (fact_r * fact_nmr);

        System.out.println(nCr);
    }

    }

