//predict the output of the code given below-
package operators;

public class second_questions_operators {
    public static void main(String[] args) {
        int x = 200, y = 50, z = 100;

        if(x > y && y > z){                   //200>50=T && 50>100=F so T && F = F so no don't print
            System.out.println("Hello");
        }

        if(z > y && z < x){                  //100>50=T && 100<200=T so T && T = T so yes print Java
            System.out.println("Java");
        }

        if((y+200) < x && (y+150) < z){         //50+200 = 250<200 = F && 50+150 = 200<100 = F so F && F = F so no don't print
            System.out.println("Hello");
            System.out.println("Hello Java");
    }
}
}

// output - Java 