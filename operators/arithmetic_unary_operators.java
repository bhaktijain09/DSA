package operators;

public class arithmetic_unary_operators{
    public static void main(String[] args) {
        int a = 10;

// run each one by one 
// if more than one are run at the same time, it takes previous result as value declared for int a to run next 
// you can see the difference in the result when all run at the same time vs when each is independently run

        // post increment - value is used then is changed - badha hai (10 to 11) lekin ghat te hue kram me so print a=11 then b=10
        int b = a++;
        System.out.println(a); // a incremented - 11
        System.out.println(b); // a existing - 10

/* uncomment these and run one by one

        // pre increment - value changes then value is used - same incremented value for both a and b
        int b = ++a;
        System.out.println(a); // a incremented - 11
        System.out.println(b); // a incremented - 11

        // post decrement - value is used then is changed - ghataa hai (10 to 9) lekin badh te hue kram me so print a=9 then b=10
        int b = a--;
        System.out.println(a); // a decremented - 9
        System.out.println(b); // a existing - 10

        // pre decrement - value changes then value is used - same decremented value for both a and b
        int b = --a;
        System.out.println(a);  // a decremented - 9
        System.out.println(b);  // a decremented - 9
        
 */
    }
}



