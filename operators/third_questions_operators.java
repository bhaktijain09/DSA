package operators;

public class third_questions_operators {
public static void main(String[] args) {
 
    int x, y, z;
    x = y = z = 2;
    x += y;
    y -= z;
    z /= (x + y);
    System.out.println(x + " " + y + " " + z);

}
  
}

// Explaination of output- 4,0,0

/* 
Assignment in Java happens right to left so, for x = y = z = 2;
initially z = 2;   // z becomes 2
          y = z;   // y becomes 2
          x = y;   // x becomes 2

   x += y; is x = x + y ie x = 2 + 2 = 4.

   y -= z; is y = y - z ie y = 2 - 2 = 0.

   z /= (x + y); is 
   z = z / (x + y) ie 
   z = z / (2 + 2) ie 
   z = z / 4 ie 
   z = 2 / 4 = 0.5 but for int, it becomes 0.

   so output is 4,0,0



*/
    

