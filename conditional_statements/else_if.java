package conditional_statements;
import java.util.*;
public class else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
if(age>=18){
    System.out.println("Adult");
}
else if(age>=13 && age<18){
    System.out.println("Teenager");
}
else{
    System.out.println("Child");
}
    }
}


/*
if(condition1){
    System.out.println(statement1);
}
else if(condition2){
    System.out.println(statement2);
}
else{
    System.out.println(statement3);
}

*/
// difference between "if - if - else" and "if - else if - else" :

// if    //whether 1st condition is true or false,           
// if    //still it checks next "if" condition                       
// else 

// if        //if 1st condition is true it doesn't necessarily check "else if" and jumps directly to else.
// else if   //else if condition is checked only when if condition is false
// else
