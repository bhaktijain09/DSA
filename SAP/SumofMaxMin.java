// Problem statement
// You are given an array “ARR” of size N. Your task is to find out the sum of maximum and minimum elements in the array.

package SAP;

import java.util.Scanner;

public class SumofMaxMin {
    

    public static void MinMaxSum(int arr[]) {
        int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
            if(smallest>arr[i]){
                smallest = arr[i];
            }
        }
        
        int sum = smallest + largest;
        System.out.println("The max number is: " + largest);
           System.out.println("The min number is: " + smallest);
              System.out.println("The sum of max and min number is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Enter the " + i + " element to be inserted inside the array: ");
            arr[i] = sc.nextInt();
        }
        MinMaxSum(arr);

    }
}


// Interview Follow-up - 

// Sometimes interviewers ask: "Can you reduce the number of comparisons?"

// Your above solution makes up to 2 comparisons per element:
// if (largest < arr[i])
// if (smallest > arr[i])
// That's about 2n comparisons in the worst case.

// There is a more advanced approach called the pairwise comparison method, which compares elements in pairs and reduces the total number of comparisons to about 3n/2.

// Your solution: O(n) time, O(1) space, simple and recommended.
// Pairwise method: O(n) time, O(1) space, but fewer comparisons and slightly more complex.

// For placement preparation and most coding platforms, your current solution is exactly what is expected. If an interviewer specifically asks about optimizing the number of comparisons, then you can mention the pairwise approach. 
// Java Logic - 
// for (int i = 0; i < n - 1; i += 2) {

//     if (arr[i] < arr[i + 1]) {

//         if (arr[i] < min)
//             min = arr[i];

//         if (arr[i + 1] > max)
//             max = arr[i + 1];

//     } else {

//         if (arr[i + 1] < min)
//             min = arr[i + 1];

//         if (arr[i] > max)
//             max = arr[i];
//     }
// }

// Notice:
// Compare the pair once.
// Only the smaller element is checked against min.
// Only the larger element is checked against max.