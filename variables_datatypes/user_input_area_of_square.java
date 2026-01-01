package variables_datatypes;
import java.util.*;
public class user_input_area_of_square {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float side = sc.nextFloat();  //or int side = sc.nextInt(); or double side = sc.nextDouble(); //double for safer side for higher decimal precision 
        float area = side * side ;    //or int Area = side * side;  or double Area = side * side;
        System.out.println(area);
       
    }
}
