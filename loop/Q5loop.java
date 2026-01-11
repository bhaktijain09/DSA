// Q5 - find the mistake in given code 

// package loop;

// public class Q5loop {
    
// public static void main(String args[]) {
// //     for(int i=0;i<=5;i++ ) {
// //         System.out.println("i = "+i);
// //     }
// // System.out.println("i after the loop = "+ i );
// }
// }



// soltion - 

// System.out.println("i after the loop = "+ i ); statement should be inside for loop since i variable is declared inside for loop
// The statement must be inside the loop OR i must be declared outside the loop.

// two solutions to correct it : 

//solution1
// for (int i = 0; i <= 5; i++) {
//     System.out.println("i = " + i);
// }

//solution2

package loop;

public class Q5loop {
    
public static void main(String args[]) {

int i;
for (i = 0; i <= 5; i++) {
    System.out.println("i = " + i);
}
System.out.println("i after the loop = " + i);
}
}