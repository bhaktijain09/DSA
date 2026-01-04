// what will be value of x and y in following program
package conditional_statements;

public class fourth_question {
    public static void main(String[] args) {
        int a = 63 , b = 36;
        boolean x = ( a < b ) ? true : false;
        int y = ( a > b ) ? a : b;

        System.out.println(x);  //the print statement was not there in the code
        System.out.println(y);  //the print statement was not there in the code
}
}


// output - a < b is 63 < 36 is false
//        - a > b is 63 > 36 is true so print a = 63
//the print statement was not there in the code so add System.out.println();