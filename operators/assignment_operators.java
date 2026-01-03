// Assignment operators are - = , += , -= , *= , /= , %=
package operators;

public class assignment_operators {
    public static void main(String[] args) {


        // =
        int num1 = 20;
        int num2 = 40;
        num1 = num2;
        System.out.println(num1);   // value of num2(40) is alloted to num1(20 previously, now 40 after allotment) 
                                   // so num1 becomes 40 and previous num1=20 value is never used after that.

        // +=
        int A = 10;
        System.out.println(A+=10);  // A = A + 10 gives 20

        // -=
         int B = 10;
        System.out.println(B-=10);  // B = B - 10 gives 0

        //*=
         int C = 10;
        System.out.println(C*=10);  // C = C * 10 gives 100

        // /=
         int D = 10;
        System.out.println(D/=10);  // D = D / 10 gives 1


        // %=
         int E = 10;
        System.out.println(E%=10);  // E = E % 10 gives 0
        
    
    }
}
