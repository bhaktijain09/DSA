package conditional_statements;
import java.util.*;
public class first_question_positive_or_negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        double number = sc.nextDouble();
        if (number>0){
  System.out.println("The entered number is positive");
        }
        else if (number<0){
  System.out.println("The entered number is negative");
        }
        else {
             System.out.println("The entered number is zero");
        }
      sc.close();
    }
}
