package practice_basic_day03;

import java.util.Scanner;

public class Q12_MetCreationForLoop {

    /* Interview Question
     Write a Java program to reverse a string. Use for loop and create a method called
      reverseString */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir cumle giriniz: ");
        String cumle = scan.nextLine();
        reverString(cumle);

    }

    private static void reverString(String cumle) {

        String reverse = "";

        for (int i = cumle.length()-1; i>=0; i--) {

            reverse = cumle.substring(i,i+1);
            System.out.print(reverse);
        }

    }

}
