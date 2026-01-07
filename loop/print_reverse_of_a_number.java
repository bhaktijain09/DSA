//To print the reverse of a number
package loop;

public class print_reverse_of_a_number {
    public static void main(String[] args) {
        
        int n = 10899;

        while(n>0){
        int last_digit = n%10;             //to get last digit - 9
        System.out.print(last_digit);
        n = n/10;                         // to get number after removing last digit - 1089
        }
        System.out.println(); 

    }
}

//                    n%10     n/10 (shortens numberfor next iteration) 
// iteration       last digit  remaining_number for_next_iteration        output_printed 
//   1                9                 1089                                    9
//   2                9                 108                                     9
//   3                8                 10                                      8
//   4                0                 1                                       0
//   5                1                 0 (-)                                   1