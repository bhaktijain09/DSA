package FunctionsMethods;

import java.util.Scanner;

public class DecimaltoBinary {
    public static int DectoBin(int DecNum){
    
        int BinNum = 0;
        int power = 0;
        
        while(DecNum>0){
        int rem = DecNum % 2; //gives 0 or 1 as remainder,  DecNum % 2 - gives the last binary digit and DecNum / 2 - removes that last digit
        BinNum = BinNum + (rem * (int) Math.pow(10, power));
        power++;
        DecNum = DecNum / 2;
        }
        return BinNum;
    }


        public static void main(String[] args){

Scanner sc = new Scanner(System.in);
int DecNum = sc.nextInt();

            int result = DectoBin(DecNum);
            System.out.println("The converted value of "+ DecNum + " is " + result);

        }
    }

