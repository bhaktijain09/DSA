package variables_datatypes;

import java.util.*;

public class user_input_area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        float r = sc.nextFloat();
        float Area = 3.14f * r * r;   
        /* 3.14f because java considers unknown decimal value as double by default
         and java cannot convert double(for larger no. - variable) into float(for smaller no. than double - ans) 
         o we add f after decimal when decimal is not declared previously */
        System.out.println(Area);

        // or 

        // float pi = 3.14; taken from user
        float pi = sc.nextFloat();
        float radius = sc.nextFloat();
        float area = pi * radius * radius;
        System.out.println(area);
    }
}
