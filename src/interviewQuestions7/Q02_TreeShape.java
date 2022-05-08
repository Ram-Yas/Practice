package interviewQuestions7;

import java.util.Scanner;

public class Q02_TreeShape {
    // Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
    // Not :govde sabit sayi olsun
            /* tac uzunlugu -> 6 iken
             *

               ^
               ^^
               ^^^
               ^^^^
               ^^^^^
               ^^^^^^
               |||
               |||
               |||
               |||
               |||
               */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Agacin Tac uzunlugu giriniz: ");
        int tac = scan.nextInt();

        /*for (int i = 1; i <= tac; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("^");
            }
            System.out.println();
        }*/

        //pratik yol
        String yaz =""; // bu degiskeni for loop icinde kullanma icin tanimladik
        for (int i = 0; i <tac ; i++) {
            yaz+="^"; // bu kod satiri sayesinde nested for loop a ihtiyac duymadan yazdik
            System.out.println(yaz);
        }

        for (int i = 0; i < 5; i++) { // govde sabit sayi oldugundan kendimizz i>5 kismmini yazdik
            System.out.println("|||");
        }

    }
}
