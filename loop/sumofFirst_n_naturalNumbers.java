package loop;

import java.util.Scanner;

public class sumofFirst_n_naturalNumbers {
    public static void main(String[] args) {
        int i = 1;                            //variable initialized
        int sum = 0;                          //initially sum = 0
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(i <= n){                     //for i = 1,2,....n so when i = 1 
             sum += i;                    //sum = sum + i;  // sum = 0 + 1 = 1
           i++;                          // i++ is increase current i by 1 ie 1+1= 2 is value of i for next iteration..and the loop continues till i=n+1
        }
        System.out.println(sum);
    }

}

// same code with n<1 exception handled using if else

// package loop;

// import java.util.Scanner;

// public class SumOfFirstNNaturalNumbers {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter n: ");
//         int n = sc.nextInt();

//         if (n < 1) {
//             System.out.println("Enter a positive number.");
//             sc.close();
//             return;
//         }

//         int i = 1;
//         int sum = 0;

//         while (i <= n) {
//             sum += i;
//             i++;
//         }

//         System.out.println(sum);
//         sc.close();
//     }
// }
