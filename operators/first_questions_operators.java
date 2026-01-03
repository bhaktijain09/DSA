//predict the output of the code given below-
package operators;

public class first_questions_operators {
    

public static void main(String[] args){
int x = 2, y = 5;
int exp1 = (x * y / x);
int exp2 = (x * (y / x));
System.out.print(exp1 + " , ");
System.out.print(exp2);
}

}

// output-

/*
x = 2, y = 5

exp1 = (x * y / x)
      = (2 * 5) / 2        // * and / have same precedence, evaluated left to right
      = 10 / 2
      = 5

exp2 = (x * (y / x))
      = 2 * (5 / 2)        // parentheses evaluated first // y/x = 5/2 = 2.5 but for int decimal(0.5) doesn't exist and give it's integer value directly so we get 2
      = 2 * 2              // integer division, fractional part discarded
      = 4

Output: 5 , 4
*/
// exp1, exp2 is 5,4 as per System.out.println(); statement given in code 




