package conditional_statements;
import java.util.*;
public class switch_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        switch(number){
            case 1: System.out.println("English");
            break;
            case 2: System.out.println("Hindi");
            break;
            case 3: System.out.println("Marathi");
            break;
            case 4: System.out.println("Marwadi");
            break;
            default: System.out.println("Not available");  // for some msg entered which doesn't exist

       }
    }
}

//switch statement -
// int variable = x                 // (x = some defined value or value taken from user using scanner)
// switch(variable){
// case z: System.out.println(statement1);
// break;
// case y: System.out.println(statement2);
// break;
// case x: System.out.println(statement3);      // output - int variable = x matches case x so prints statement3
// break;
// . 
// .
// .
// default: System.out.println(statement4);
// }

// output - int variable = x matches case x so prints statement3





