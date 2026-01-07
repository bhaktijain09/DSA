package loop;

import java.util.Scanner;

public class reverse_thegiven_number {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int original = n;                        // fixes original value taken from user input when we print output statement(line 20), since n variates after every iteration, so int original(fixed value) gives initial n value

        // int n = 10899;
        int rev=0;   //initialize rev with 0
while(n>0){                                        
        int last_digit = n%10;
        rev= rev*10 + last_digit;
        n = n/10;
    }

    System.out.print("The reverse of" + " " + original + " "+ "is" + " " + rev);
    }
}


//                    n%10     n/10 (shortens numberfor next iteration)     
// iteration       last digit  remaining_number for_next_iteration        rev= rev*10 + last_digit;     output_printed 
//   1                9                 1089                               0 = 0*10 + 9 = 9                    9
//   2                9                 108                                9 = 9*10 + 9 = 99                   99
//   3                8                 10                                 99 = 99*10 + 8 = 998                998
//   4                0                 1                                  998 = 998*10 + 0 = 9980             9980
//   5                1                 0 (-)                              9980 = 9980*10 + 1 = 99801          99801