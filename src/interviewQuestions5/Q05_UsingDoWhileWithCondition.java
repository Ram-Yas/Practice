package interviewQuestions5;

import java.util.Scanner;

public class Q05_UsingDoWhileWithCondition {
    /*
        Ask user to enter an integer.
        If the integer is less than 100, tell user "Won!"
        Otherwise tell user "Lost!"
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number;

        do { //100'den kucuk oldukca sayiyi gir, sayi 100'den kucukse won, degilse lost yazar
            System.out.print("bir sayi girin: ");
          number = scan.nextInt();
          if (number < 100){
              System.out.println("Won");
          }

        } while (number<100);// sayi 100'den kucuk oldugu surece kod blogu calisir
        System.out.println("Lost");
    }

}
