// CallByValueDemo - product a & b lecture

package FunctionsMethods;

public class product_ab_multiplication_with_function{
    public static int multiply (int a, int b){
        int product = a * b;
        return product;
    }

        public static void main(String[] args){
            int a = 3;
            int b = 5;
            int prod = multiply (a, b);   // calling function
            System.out.println("a*b = " + prod);

            prod = multiply (10, 20);   //directly passing value after calling function
            System.out.println("a*b = " + prod);
        }

    }

