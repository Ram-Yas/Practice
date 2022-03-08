package practice_basic_day02;

import java.util.Scanner;

public class Q19_StringManipulation13 {

    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Dort harfli bir kelime girin : ");
        String word = scan.next();

       if(word.length()==4) {
           System.out.println(word.substring(3) +
                   word.substring(2, 3) +
                   word.substring(1, 2) +
                   word.substring(0, 1));
       }else {
           System.out.println("Maalesef yanlis giris yaptiniz.");
       }
    }
}
