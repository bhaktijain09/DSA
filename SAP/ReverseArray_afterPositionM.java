// TWO POINTER APPROACH PATTERN


// Problem statement - Reverse the array after position M.

// Given an array/list 'ARR' of integers and a position ‘M’. You have to reverse the array after that position.
// Example:
// We have an array ARR = {1, 2, 3, 4, 5, 6} and M = 3 , considering 0 
// based indexing so the subarray {5, 6} will be reversed and our 
// output array will be {1, 2, 3, 4, 6, 5}.

// understanding - so in ARR = {1, 2, 3, 4, 5, 6}, after M = 3 ie after index3 having value 4, reverse remaining numbers in array ie 5 as 6 and 6 as 5

package SAP;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray_afterPositionM {

    public static void ReverseAfterM(int ARR[], int M) {
        int left = M + 1;
        int right = ARR.length - 1;

        while (left < right) {
            int temp = ARR[left];
            ARR[left] = ARR[right];
            ARR[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n = sc.nextInt();
        int ARR[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element " + i + " you want to insert in the array: ");
            ARR[i] = sc.nextInt();
        }
        System.out.println("Enter the target position (index) M: ");
        int M = sc.nextInt();

        ReverseAfterM(ARR, M);
        System.out.println(Arrays.toString(ARR));

    }

}

// Why Two Pointers?
// You need to reverse part of an array.

// Whenever you hear:
// Reverse an array
// Reverse part of an array
// Reverse a string
// Check palindrome
// Move elements from both ends

// you should immediately think: Two Pointers

// Pattern - Start one pointer from the left and one from the right.