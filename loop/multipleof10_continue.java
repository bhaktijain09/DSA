package loop;

import java.util.Scanner;

public class multipleof10_continue {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

do{
System.out.println("Enter your number:");
int number = sc.nextInt();

if (number%10 == 0){
System.out.println("your number is multiple of 10, invalid!");
continue;          // skips the number which is multiple of 10
}

System.out.println("your number is " + number + " , valid!");
}

while(true);

}
}

