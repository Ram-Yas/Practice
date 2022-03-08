package practice_basic_day02;

import java.util.Scanner;

public class Q11_StringManipulation05 {
    /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println( " Dort kelime girin");
        String str1 = scan.next();
        String str2 = scan.next();
        String str3 = scan.next();
        String str4 = scan.next();

        System.out.println("girdiginiz cumle = "+str1.substring(0,1).toUpperCase()+str1.substring(1)
                                                + " "+ str2+ " "+ str3+ " "+ str4+".");

    }
}
