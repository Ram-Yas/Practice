package interviewQuestions6;

import java.util.Scanner;

public class Q05_ExponentialNumber {
        /*
          Get 2 numbers from the user.
        first number base
        second number Top
        Write a code that calculates the prime of a number.
         2, 3 --> 2^3 = 2*2*2= 8
         4, 3 --> 4^3= 4*4*4 = 64
         */

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen taban ve ust giriniz : ");
        int taban = scan.nextInt();
        int power = scan.nextInt();
        
        int result = 1;
        
        while (power!=0){
            result*=taban;
            power--;
        }
        System.out.println("while ile "+ result);

        //2.yol

        System.out.print("Lutfen taban ve ust giriniz : ");
        int taban2 = scan.nextInt();
        int power2 = scan.nextInt();
        System.out.println(Math.pow(taban2, power2));

        //3.yol

       result = 1;
        for (int i = 0; i < power2; i++) {
            result*=taban2;

        }
        System.out.println("for ile sonuc: "+ result);
    }
  
}
