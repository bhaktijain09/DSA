// Relational operators are - == , != , > , < , >= , <=

package operators;

public class relational_operators {
    public static void main(String[] args) {

// run each one by one

    //checks equality a==b (equal to)
    int a = 10;
    int b = 10;
    System.out.println((a == b));   //true
    // int a = 10;
    // int b = 5;
    // System.out.println((a == b));   //false

    //checks inequality c!=d (not equal to)
    int c = 10;
    int d = 5;
    System.out.println((c != d));   //true
    // int c = 10;
    // int d = 10;
    // System.out.println((c != d));   //false

    // checks greater than
    int e = 10;
    int f = 5;
    System.out.println((e > f));   //true
    // int e = 5;
    // int f = 10;
    // System.out.println((e > f));   //false

    //checks less than
    int g = 5;
    int h = 10;
    System.out.println((g < h));   //true
    // int g = 10;
    // int h = 5;
    // System.out.println((g < h));   //false
 
    // checks greater than or equal to
    int i = 10; //or int a = 11; ie greater than 10
    int j = 10;
    System.out.println((i >= j));   //true
    // int i = 5;
    // int j = 10;
    // System.out.println((i >= j));   //false

    //checks less than or equal to
    int k = 10; //or int a = 0,1,2,3,4,....till 10 ; ie less than 10
    int l = 10;
    System.out.println((k <= l));   //true
    // int k = 10;
    // int l = 5;
    // System.out.println((k <= l));   //false
    }
}
