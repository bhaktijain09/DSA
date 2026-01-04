package conditional_statements;
import java.util.*;
public class Ternary_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();             // scans or takes number through sc.nextInt() and save it in number(int)

//Ternary operator - datatype Variable = condition ? Statement 1(if true) : Statement 2(if false);

        String result = (number%2==0) ? "Even" : "Odd"; //condition is checked using number%2==0 and print even or odd which is then stored in result (String) 
        System.out.println(result);

        sc.close();   //used to close Scanner
    }
}


// The real purpose of ternary is:

// 1. expression-based decision
// 2. returning a value inline
// 3. reducing branching noise