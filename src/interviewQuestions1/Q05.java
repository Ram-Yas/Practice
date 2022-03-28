package interviewQuestions1;

import java.util.Scanner;

public class Q05 {

        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("bir cumle giriniz: ");
            String cumle = scan.nextLine();
            System.out.println("bir harf giriniz");
            String harf = scan.next();
            int sayac = 0;

            for (int i = 0; i < cumle.length()-1; i++) {
                if (cumle.charAt(i) == harf.charAt(0)){
                    sayac++;
                }
            }
            System.out.println(cumle + " cumlesinde "+ harf + " harfi "+sayac+ " kadar kullanildi");
        }






}
