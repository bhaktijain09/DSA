package operators;

public class fourth_questions_operators {
    public static void main(String[] args){
        int x = 9, y = 12;
        int a = 2, b = 4, c = 6;
        int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
        System.out.println(exp);

    }
}

// Explaination of the output - 278

// all brackets willbe solved first 

// 4/3 * (x+34) 
// 1.33 * (9+34) BUT JAVA CONSIDER 1 FOR 1.33
// 1 * 43 
// 43 -----------------------------------------------A

// 9 * (a + b * c) = (* then +) 
// 9 * (2 + 4*6) 
// 9 * (2 + 24) = 9 * 26 
// = 234 --------------------------------------------B

// (3 + y * (2 + a)) / (a + b*y)
// (3 + 12 * (2 + 2)) / (2 + 4*12)
// (3 + 12 * (4)) / (2 + 48)
// (3 + 48) / 50
// 51 / 50 
// 1.02 
// 1 -------------------------------------------------C

// A+B+C = 43 + 234 + 1
//       = 278


// FINAL OUTPUT = 278