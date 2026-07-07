// find the sum of 2 numbers whose product is maximum in an integer array.

// Hint for solution - largest product can come from largest and second positive largest number or largest product can come from largest and second negative largest negative number
// largest(+) * 2nd largest(+) = +
// largest(-) * 2nd largest(-) = +


package SAP;
import java.util.Scanner;
public class sum_2nums_productisMax {
       public static void prosum(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                secondlargest = largest;
                largest = arr[i];
            } else if (secondlargest < arr[i]) {
                secondlargest = arr[i];
            }

            if (smallest > arr[i]) {
                secondsmallest = smallest;
                smallest = arr[i];
            } else if (secondsmallest > arr[i]) {
                secondsmallest = arr[i];
            }

        }
        System.out.println("The largest number in the array is " + largest
                + " and second largest number in the array is " + secondlargest);
        int product1 = largest * secondlargest;
        System.out.println("The product of those two numbers in the array is " + (product1));

        System.out.println("The smallest number in the array is " + smallest
                + " and second smallest number in the array is " + secondsmallest);
        int product2 = smallest * secondsmallest;
        System.out.println("The product of those two numbers in the array is " + (product2));

        if (product1 > product2) {
            System.out.println(
                    "The sum of numbers whose product is largest in the array is " + (largest + secondlargest));
        } else {
            System.out.println(
                    "The sum of numbers whose product is largest in the array is " + (smallest + secondsmallest));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + i + " element: ");
            arr[i] = sc.nextInt();
        }
        prosum(arr);

    }
}




