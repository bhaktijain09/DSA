package loop;

import java.util.Scanner;

public class print_1_to_n_numbers {
    public static void main(String[] args) {
        int counter = 1;                                   //variable initialized
        System.out.println("Enter the value of n:");

        Scanner sc = new Scanner(System.in);              // user taken value
        int n = sc.nextInt();                             // value stored in n

// if (n<0){
//             System.out.println("Enter the positive number");     //optional
//         }
// else{

          System.out.println("The printed numbers are:");

        while(counter<=n){                          // 1 to n
            System.out.println(counter);           // value printed
            counter++;                            // increase by +1 after every iteration
        }
        sc.close();
    }
}
// }


// only logic, no extra clutter - 

// package loop;
// import java.util.Scanner;
// public class print_1_to_n_numbers {
//     public static void main(String[] args) {

//         int counter = 1;                                   //variable initialized

//         Scanner sc = new Scanner(System.in);              // user taken value
//         int n = sc.nextInt();                             // value stored in n

//         while(counter<=n){                          // 1 to n
//             System.out.println(counter);           // value printed
//             counter++;                            // increase by +1 after every iteration
//         }
//         sc.close();
//     }
// }

