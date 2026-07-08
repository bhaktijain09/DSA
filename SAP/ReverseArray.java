// Reverse an array - swapping 1st and last number, swapping 2nd and 2ndlast number logic, swapping 3rd and 3rdlast number logic...
// solution - remember swapping i and arr.length-1 - i using temp, swapping iteration in for loop till arr.length/2, Arrays.toString(arr) because array cannot be printed directly so convert to string.

package SAP;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void ReversingArray(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
        // return arr[];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + i + " element to be inserted in array: ");
            arr[i] = sc.nextInt();
        }
        ReversingArray(arr);

    }
}

// Start with two positions:
// One at the beginning of the array. (i=0)
// One at the end of the array. (arr.length-1) ie 5-1 = 4 // id arr.length is 5
// then arr operates from 0 to 4 that's why arr.length-1
// Swap the elements at these two positions. (temp logic)
// Move the beginning position one step forward and the end position one step
// backward. (next i = 0+i) (next last position ie backwards = arr.length-1 - i)
// Repeat the swapping until you reach the middle of the array.

// [explaination for arr.length/2 - middle of array because you replace 0 with
// 4, 1 with 3, 2 with 2 - half array reached ie arr.length/2 reached.]
// [now if you continue to swap 3 with 1, 4 with 0, it will result in original
// array and not the reversed array.]
// [Thus we iterate from 0 to arr.length/2]