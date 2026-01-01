package variables_datatypes;

public class datatype {
    public static void main(String[] args){
        int a = 10;                              //int
        int b = 5;
        System.out.println(a);
        System.out.println(b);

        String name = "Tonystark";             // " " for String while declaring
        System.out.println(name);

        a = 50;                       // no int (datatype) before variable when redeclaring the previously declared (a) variable
        System.out.println(a);

// primitive datatypes 
    // 1. char to store a single alphabet
        char ch = 'a' ;
        System.out.println(ch);

    // 2. String to store multiple alphabet ie word, but a "non primitive" datatype
       String names = "Tonystark";           
        System.out.println(names);

    // 3. int to store a number 
       int number = 10;
       System.out.println(number);

    // 4. long to store bigger number
       long digits = 34366;
       System.out.println(digits);

    // 5. float to store decimal number
       float price = 5;
       System.out.println(price);

    // 6. double to store long decimal number
          double weight =  54.66666667777777;
          System.out.println(weight);

    // 7. boolean to store true or false value
          boolean var = true;
          System.out.println(var);
          boolean vars = false;
          System.out.println(vars);

    // 8. short to store number
          short n = 90;
          System.out.println(n);

    // 9. byte to store the values between 0 to 256
          byte t = 8;
          System.out.println(t);
          byte u = 9;
          System.out.println(u);


// int - 4 byte = to store numbers larger than -2 Billion to +2 Billion
// long - 8 byte = to store numbers larger than -2 Billion to +2 Billion
// float - 4 byte = to store numbers in decimal
// double - 8 byte = to store numbers having more digits after decimal
// char - 2 byte = "a to z", "A to Z", "%", ",", "@"
// short - 2 byte = also has some range of around -32,768 to 32,767
// byte - 1 byte =  -128 to 127 = 256 bytes
// boolean - 1 byte = true or false


    }
}
