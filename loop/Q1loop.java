package loop;

public class Q1loop {
    public static void main(String[] args) {
       for(int i=0; i<5; i++){
        System.out.println("Hello");
        i+=2;
    }
}
}

// output - from i=0 to i<5 after every iteration + 2 "Hello" statement will be printed

// In this for loop, the variable i is modified twice in each iteration: once by i += 2 inside the loop body
// and once by i++ in the for-loop update statement. As a result, the value of i increases by 3 in every
// iteration. Starting from i = 0, the loop runs while i < 5, so the statement "Hello" is printed only
// two times before the condition becomes false and the loop terminates.

