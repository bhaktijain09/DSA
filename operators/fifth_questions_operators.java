package operators;

public class fifth_questions_operators {
    public static void main(String[] args){
        int x = 10, y = 5;
        int exp1 = (y * (x / y + x / y));
        int exp2 = (y * x / y + y * x / y);
        System.out.println(exp1);
        System.out.println(exp2);
    }
}


// Explaination of the code -
/*
x = 10, y = 5

exp1 = y * (x / y + x / y)
     = 5 * (10/5 + 10/5)        // parentheses evaluated first, priority will be solve the bracket, inside bracket priority is / then + then * after bracket is solved
     = 5 * (2 + 2)
     = 5 * 4
     = 20

exp2 = y * x / y + y * x / y
     = ((5 * 10) / 5) + ((5 * 10) / 5)   (/ and  * are at same level, evaluated left to right then + at last)
     = (50/5) + (50/5)
     = 10 + 10
     = 20

Output:
20
20
*/



