// keep entering number until user enters multiple of 10
package loop;
import java.util.Scanner;

public class multipleof10_break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int i;
        for(i=1; i>0; i++){
            System.out.println("Enter your number:");
            int number = sc.nextInt();
           if(number%10 == 0){
            System.out.println("your number is multiple of 10");
            break;
           }
        
        }
       
        
       
      

    }

}
