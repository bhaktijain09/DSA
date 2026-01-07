package loop;

import java.util.Scanner;

public class AverageOfNExamScores{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of subjects");
        int n = sc.nextInt();

        if(n<1){
            System.out.println("Invalid number of subjects, Try again");
            sc.close();
            return;         //return for condition, continue for loop - continue only makes sense inside a loop.
        }

// End the program - return (no need to move further for score calculation if number of subjects are invalid)
// Or ask again - needs a loop - continue (continue - skips current loop iteration only)

        double sum = 0;

        
        for(int i=1; i<=n;){                           // i is counter / iteration number
        double score = sc.nextDouble();

        if(score<0 || score>100){
            System.out.println("Invalid range, enter the score between 0 to 100");
            continue;     //(continue - skips current loop iteration only)

        }

         sum += score;
         i++;                // VVVIMP - increment ONLY after valid input  
         //If i++ is in the for header, the counter increments even when the score is invalid, causing the loop to count invalid input as a subject and resulting in fewer valid scores being averaged.
        }

        double avg = sum/n;
        System.out.println(avg);

        sc.close();

    }
}
    





















// package loop;

// import java.util.Scanner;

// public class AverageOfNExamScores {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number of subjects: ");
//         int n = sc.nextInt();

//         if (n < 1) {
//             System.out.println("Number of subjects must be positive.");
//             sc.close();
//             return;
//         }

//         double sum = 0;

//         System.out.println("Enter exam scores between 0 to 100):");
//         for (int i = 1; i <= n; ) {
//             double score = sc.nextDouble();

//             if (score < 0 || score > 100) {
//                 System.out.println("Invalid score. Enter again.");
//                 continue;   // retry same subject
//             }

//             sum += score;
//             i++;                // VVVIMP - increment ONLY after valid input
//         }

//         double average = sum / n;
//         System.out.println("Average of exam scores: " + average);

//         sc.close();
//     }
// }
