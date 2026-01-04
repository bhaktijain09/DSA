// income - 0L to 5L - 0% tax
// income - 5L to 10L - 20% tax
// income - greater than 10L - 30% tax

// 1st approach :
package conditional_statements;
import java.util.*;
public class income_tax_calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();    // to avoid type casting (int) later, declare int income and int tax as double income and double tax
        int tax;

        if (income < 500000){
            tax =  (income * 0) ;  //didn't needed (int) type casting here because 0 is considered int only bu java and not double
        }
        else if (income>=500000 && income<1000000){
            tax = (int) (income * 0.20) ;  //java considers 0.20 as double as type conversion from double to int is not allowed so we add (int) by type casting 
        }
        else {
            tax = (int) (income * 0.30); //java considers 0.30 as double as type conversion from double to int is not allowed so we add (int) by type casting
        }
           System.out.println("Your tax amount is:" + tax);
    }
    
}


// 2nd approach :

// package conditional_statements;
// import java.util.*;
// public class income_tax_calculator {
//     public static void main(String[] args){
//  Scanner sc = new Scanner(System.in);
//         double income = sc.nextDouble();   
//         double tax;

//         if (income < 500000){
//             tax = 0 ;  
//         }
//         else if (income>=500000 && income<1000000){
//             tax = (income * 0.20) ;  
//         }
//         else {
//             tax = (income * 0.30); 
//         }
//            System.out.println("Your tax amount is:" + tax);
//     }
// }