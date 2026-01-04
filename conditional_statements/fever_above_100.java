package conditional_statements;

public class fever_above_100 {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);    //if user input type question
        // System.out.println("Enter the temperature:");
        // double temp = sc.nextDouble();
        double temp = 103.5;                     //given in question
        if (temp>100){
            System.out.println("You have fever");
        }
        else{
            System.out.println("You don't have fever");
        }
    }
    }
