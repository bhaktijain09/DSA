package FunctionsMethods;

import java.util.Scanner;

public class BinarytoDecimal {
   public static int BinDec(int BinNum){
     
    int DecNum = 0;
    int power = 0;

    while(BinNum>0){

    int lastDigit = BinNum % 10;

    if (lastDigit != 0 && lastDigit != 1){
        System.out.println("Error: Invalid Number");   // edge condition if input is other than 0's and 1's for binary number
        return -1;
    } 

    DecNum = DecNum + (lastDigit * (int) Math.pow(2, power));
    power++;
    BinNum = BinNum / 10;
}
    return DecNum;
}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int BinNum = sc.nextInt();

        int result = BinDec(BinNum);
        System.out.println("The conversion of Binary number " + BinNum + " is " + result);

    }
}

   



// input binary number
// take its last digit by % modulo
// multiply it by 2 to the power, power was initialized by 0
// add it to decimal number which was initialized by 0
// update power ++
// update decimal number by division of previous decimal number by 10

// eg - 1011
// lastD = 1011 % 10 = 1
// power*lastD = 1 * 2^0 = 1
// add it to decimal => dec = 0 + 1 so dec = 1
// update power = 0 to 1
// updated binary number = 1011 / 10 = 101

// 101 % 10 = 1
// 1 * 2^1 = 2
// dec = 1 + 2 so dec = 3
// 1 to 2
// 101 / 10 = 10

// 10 % 10 = 0
// 0 * 2^2 = 0
// dec = 3 + 0 so dec = 3
// 2 to 3
// 10 / 10 = 1

// 1 % 10 = 1
// 1 * 2^3 = 8
// dec = 3 + 8 so dec = 11
// 3 to 4
// 1 / 10 =  0 end 

