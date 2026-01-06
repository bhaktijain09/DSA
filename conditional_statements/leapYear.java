// Divisible by 400 → leap year                    //year which is divided by 400 definitely can be divided by 100 and 4 so if 1st statement holds true, no need to check next ones!

// Divisible by 100 but NOT 400 → not leap year   //condition applied 100 for century years

// Divisible by 4 but NOT 100 → leap year 

// Not divisible by 4 → not leap year  


// flow goes from right to left
//                    yes                        yes                        yes
// is divisible by 4 -----> is divisible by 100 -----> is divisible by 400 -----> leap year
//     |                           |                             |
//     no                         no                             no
//     |                           |                             |
//   not a leap year            leap year                   not a leap year

package conditional_statements;
import java.util.*;
public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%400==0){                                // eg - year = 2020 % 400 = 20
          System.out.println(year + "is a leap year");
        }
        else if (year%100==0){                          // eg - year = 2020 % 100 = 20
          System.out.println(year + "is not a leap year");  
        }
        else if (year%4==0){                            // eg - year = 2020 % 4 = 0, so 2020 is a leap year
          System.out.println(year + "is a leap year"); 
        }
        else {
          System.out.println(year + "is not a leap year");  
        }
        sc.close();
        }
}
