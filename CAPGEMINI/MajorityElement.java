import java.util.Scanner;

public class MajorityElement {
    public static int majorityElement(int[] arr) {
        int candidate = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                candidate = arr[i];
            }
            if (candidate == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        return candidate; // final value returned is candidate which is the majority element
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt(); // n is array size
        int arr[] = new int[n]; // created array of size n
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + i + " position element in the array: ");
            arr[i] = sc.nextInt(); // take input arr[i] from i = 0 to n
        }

       
        System.out.println("Majority element in the array is: " + majorityElement(arr));
    }
}
