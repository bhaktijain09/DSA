package loop;

public class while_loop {
    public static void main(String[] args) {
       int counter = 0;           // variable initialized
       while(counter < 100){      // 100 = 0 to 99
       System.out.println("Hello world");  //print statement 
       counter++;                 // +1 after every iteration to print 0th time then 1th time then....till 99th time, since <100
    }

    }
}

// output -  Hello world printed 100 times 

// int variable = 0;                                                // variable initialized
//        while(condition){                                        // n = 0 to (n-1)th
//        System.out.println(output statement);                   //print statement 
//        counter++;       // +1 after every iteration to print 0th time then 1th time then....till (n-1)th time, since variable < n
//     }

// INFINITE LOOP - IF WE WRITE true INSTEAD OF CONDITION 

// int variable = 0;                                                // variable initialized
//        while(true){                                             // n = 0 to (n-1)th
//        System.out.println(Hello world);                        //print statement 
//        counter++;       // +1 after every iteration to print 0th time then 1th time then....till (n-1)th time, since variable < n
//     }

// output - Hello world
//          Hello world
//          Hello world
//          .
//          .
//          .
//          till infinity 