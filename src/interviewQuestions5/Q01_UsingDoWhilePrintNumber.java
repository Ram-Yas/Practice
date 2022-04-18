package interviewQuestions5;

import java.util.Scanner;

public class Q01_UsingDoWhilePrintNumber {

    public static void main(String[] args) {

        /*
        create one int
        do while int is less then 100
        print the number
        increment by 5
        for example: 0   5   10  15  20
        */
        Scanner scan = new Scanner(System.in);
        // System.out.println("sayi giriniz : "); bu satir olmayada bilir
        int sayi = scan.nextInt();

        do { //sayi 100'den kucuk oldukca 5'er 5er artir
            System.out.print(sayi + " ");
            sayi += 5; // increment degeri

        } while (sayi < 100); //sartimiz

    }
}
