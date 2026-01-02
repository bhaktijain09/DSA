// type conversion or widening or implicit conversion 

/* 

type conversion happens when - 

1. type compatible  
eg - int and float type can be converted within each other so compatible like 20 is int is 20.0 in float
but boolean to int cannot be converted like true/false into 20 so incompatible 


2. destination type > source type - 
REMEMBER - bsifld
byte -> short -> int -> float -> long -> double

byte can be converted to short and onwards
short can be converted to int and onwards but not short to byte
int can be converted to float and onwards but not int to short or byte
float can be converted to long and onwards but not float to byte or short or int
long can be converted to double but not float to byte or short or int or float
*/

/*  from example of code discussed below, float number = sc.nextInt(); refers to int scanned and saved in float 
so conversion from int to float - compatible and type conversion allowed */
/* whereas int number = sc.nextFloat(); will result in lossy conversion 
since types are compatible but float to int is not allowed as source type > destination type */

// similarly you can do for other types such as byte, short, int, float, long, double 
// according to "source to destination" type compatibilty and allowed sequence discussed above

// here is an example of type conversion from int to float 
package variables_datatypes;

import java.util.*;

public class type_conversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float number = sc.nextInt();
        System.out.println(number);

    }
}
