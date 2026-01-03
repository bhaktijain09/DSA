package operators;

public class logical_operators {
    public static void main(String[] args) {


        //Logical AND (&&)
        System.out.println( (3>2) && (5>4) );  //T&&T = T
        System.out.println( (3>2) && (3>4) );  //T&&F = F
        System.out.println( (1>2) && (5>4) );  //F&&T = F
        System.out.println( (1>2) && (3>4) );  //F&&F = F

        //Logical OR (||)
        System.out.println( (1>2) || (3>4) );  //F||F = F
        System.out.println( (3>2) || (3>4) );  //T||F = T
        System.out.println( (1>2) || (5>4) );  //F||T = T
        System.out.println( (2>1) || (5>4) );  //T||T = T
        
        //Logical NOT (!) 
        System.out.println( !(5>1) );   //IS TRUE BUT RETURNS FALSE SINCE LOGICAL NOT (T but returns/gives F)
        System.out.println( !(10>20) ); //IS FALSE BUT RETURNS TRUE SINCE LOGICAL NOT (F but returns/gives T)
    }
    
}
