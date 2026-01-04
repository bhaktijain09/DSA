package conditional_statements;

import java.util.Scanner;

public class pass_or_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double marks = sc.nextDouble();
        double pass_marks = 33;                
        if(marks>=0 && marks<=100){          //defines range of marks to be entered between 0 to 100 and invalidates marks greater than 100 and less than 0
        String status = (marks>=pass_marks) ? "Pass" : "Fail" ;
        System.out.println(status);
        }
        else{
            System.out.println("The entered marks are invalid");   //for marks entered outside the range
        }
        sc.close();
      
    }
}
