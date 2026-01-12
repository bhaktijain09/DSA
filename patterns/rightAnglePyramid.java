package patterns;

public class rightAnglePyramid {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){      // i represents no. of line to be printed (i = NO.OF LINE)
            for(int j=1; j<=i; j++){ // j represents no. of times * is printed in each line (j = NO. OF * IN EACH LINE)
System.out.print("*");
            }
            System.out.println();  //next line
        }
    }
}
