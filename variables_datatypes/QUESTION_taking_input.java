package variables_datatypes;
import java.util.*;

public class QUESTION_taking_input {
    public static void main(String[] args){

Scanner sc = new Scanner(System.in);


// 1.  next(); - (words) - reads until it hits whitespace

String a = sc.next();
System.out.println( "[" + a + "]" );

// input - Hello World
// output - [Hello]         
/*reads until it hits whitespace, whitespace hitted after Hello so scanner stopped after Hello 
and printed only Hello inside brackets added by logic "[" + a + "]"  */ 



//2.  nextLine(); - reads until it hits newline (\n)

String b = sc.nextLine();
System.out.println("[" + b + "]");

/* input - Hello World */
// output - [Hello World]  


//3.  nextInt();

int x = sc.nextInt();
System.out.println(x * 2);

// input - 10
// output - 20


//4.  nextLong();
//5.  nextShort();
//6.  nextFloat();
//7.  nextDouble();

double d = sc.nextDouble();
System.out.println(d);

//input - 2.50
//output - 2.5

//8.  nextBoolean();

boolean c = sc.nextBoolean();
System.out.println(c);

//input - TRUE
//output - true

// EXERCISE 

String u = sc.nextLine();
String v = sc.next();
System.out.println("[" + u + "]");
System.out.println("[" + v + "]");
/* input - Hello World
           Java 
output - [Hello World]  //nextLine reads entire line Hello world until it hits newline (\n)
         [Java] */      //next reads the first single word after nextLine content is fully read


String z = sc.next();
String y = sc.nextLine();
System.out.println("[" + z + "]");
System.out.println("[" + y + "]");
 //input - Hello World
 /*output - [Hello]                  //single word
            [ World]*/             //next whole line with space ie [space World]



//4.  nextLong();  //will print the long number as it is - eg- 9999999
//5.  nextShort(); //will print the short number as it is if between -32,768 to 32,767
//6.  nextFloat(); //will print the decimal number as it is - eg- 99.92
//7.  nextDouble(); //will print the long decimal number as it is - eg- 99.9299328
//9.  nextByte(); //will print the Byte number as it is if between -128 to 127

    }
}
