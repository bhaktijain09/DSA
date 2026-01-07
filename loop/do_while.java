package loop;

public class do_while {
    public static void main(String[] args) {
        
// do-while loop //

// Definition:
// Executes the loop once first, then checks the condition.
// So the loop runs at least once, no matter if the condition is true or false.
// do while - whether condition is true or false, it executes at least once and repeats the loop if condition is true

// Example:

int n = 0;
do {
    System.out.println(n);
} while (n > 0);

    }
}
// Output: 0



// while loop //

// Definition:
// Checks the condition first, then executes the loop.
// If the condition is false initially, the loop runs zero times.

// Example:

// int n = 0;
// while (n > 0) {
//     System.out.println(n);
// }

// Output: nothing (condition fails immediately)



// One-line difference
// while may execute zero times; do-while executes at least once.









