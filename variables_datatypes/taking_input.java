package variables_datatypes;

import java.util.*;  //package which stores all the classes, here we need Scanner class

public class taking_input {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);    //Scanner is a class and ss/scn/s ie any name is object, System.in takes input from user
 

// sc.next() for storing words, word can be alphabetic/numeric/alphanumeric - bhakti, 998776, 67367hgfasghf
        String input = sc.next();
        System.out.println(input); 
// user entered data/input is captured by sc.next() and stored in input which is then printed by System.out.println(input);

/* sc.nextLine() for storing multiple words with space, basically used for sentences where 
   each word in a sentence can be either completely alphabetic/numeric/alphanumeric - bhakti 2026 bhakti2026 */
        String name = sc.nextLine();
        System.out.println(name);
// user entered data/input is captured by sc.nextLine() and stored in name which is then printed by System.out.println(name);

// sc.nextInt() for storing integer
        int number = sc.nextInt();
        System.out.println(number);
// user entered data/input is captured by sc.nextInt() and stored in number which is then printed by System.out.println(number);
 


//REMEMBER LEARNINGS - Basic structure to take input
/* 
import java.util.*;                     //import package on top

Scanner sc = new Scanner (System.in);   //common line to scan input from system
datatype any_name = sc.nexttype();      // sc.nexttype(); depending_upon_user-entered value_type
System.out.println(any_name);
*/
 
// OTHER nexttype(); are -
/* 
next();
nextLine();
nextInt();
nextLong();
nextShort();
nextFloat();
nextDouble();
nextBoolean();
nextByte();
*/

}
}
