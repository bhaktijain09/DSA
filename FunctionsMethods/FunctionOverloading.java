package FunctionsMethods;

public class FunctionOverloading {

    // 1. function overloading with parameters
    public static int numbers(int a, int b) { // passing 2 parameters a,b
        return a + b;
    }

    public static int numbers(int a, int b, int c) { // passing 2 parameters a,b,c
        return a + b + c;
    }

    // function overloading with datatypes
    public static int amount(int p, int q) { // passing parameters with datatype int
        return p + q;
    }

    public static float amount(float p, float q) { // passing parameters with datatype float
        return p + q;
    }

    // function calling
    public static void main(String[] args) {
        System.out.println(numbers(3, 2)); // 2 parameters
        System.out.println(numbers(3, 1, 1)); // 3 parameters

        System.out.println(amount(3, 2)); // parameter with datatype int
        System.out.println(amount(3.2f, 1.8f)); // parameter with datatype float
    }

}
