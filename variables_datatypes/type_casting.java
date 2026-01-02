//type casting is used when we already know that type conversion will result in lossy conversion 
// but we still need that type conversion to occur so we use type casting.
// eg- int scanned and saved in float is allowed 
// but float scanned and saved in int is not allowed and will result in lossy conversion but we still want float to int type conversion

// package variables_datatypes;

// public class type_casting {
// public static void main(String[] args) {
//     float a = 10;
//     int b = a;
//     System.out.println(b);
// }
//  } -----------------------------------type conversion error since it is lossy conversion

// subtopic 1 - code to be run seperately -
package variables_datatypes;

public class type_casting {
    public static void main(String[] args) {
    float a = 99.99999f;
    int b = (int) a;
    System.out.println(b);
} 
    }
// ---inserted( destination type ), here (int) ensures that yes we want to convert it even if its a lossy conversion 


//Every character from a to z and A to Z have a number assigned to it 
// so when we take char a and convert that char to int, the number associated with that char gets print
// eg - a,b,c,d,e,....with 97,98,99,100,101,...
// A,B,C,D,E,....with 65,66,67,68,69,....

// subtopic 2 - code to be run seperately -

// package variables_datatypes;

// public class type_casting {
//     public static void main(String[] args) {
//     char ch = 'a';
//     int number = ch;
//     System.out.println(number);
// } 
//     }