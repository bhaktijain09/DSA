// A 
// BC 
// DEF 
// GHIJ 

package patterns;

public class CharacterPattern {
    public static void main(String[] args) {
        
        int n = 4;
        char ch = 'A';

        for(int i=1; i<=n; i++){      // n is defined above as 4 - same meaning as previous questions ie n = no.of lines = 4
            for(int j=1; j<=i; j++){  // j represents counter for no.of characters ie line 1 having 1 character, line 2 having 2 characters and so on... 
                System.out.print(ch); //char ch is defined above 
                ch++;                 // and increased by 1 character (A to B to C to...) after every j iteration
            }
            System.out.println(); // and line is changed after every i iteration
        }
    }
}
